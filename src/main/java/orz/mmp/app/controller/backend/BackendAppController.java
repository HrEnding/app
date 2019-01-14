package orz.mmp.app.controller.backend;

import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import orz.mmp.app.pojo.AppCategory;
import orz.mmp.app.pojo.AppInfo;
import orz.mmp.app.pojo.DataDictionary;
import orz.mmp.app.service.backend.AppCategoryService;
import orz.mmp.app.service.backend.DataDictionaryService;
import orz.mmp.app.service.backend.impl.AppInfoServiceImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/appCheckController")
public class BackendAppController {
    @Resource
    private AppInfoServiceImpl appInfoServiceImpl;
    @Resource
    private AppCategoryService appCategoryService;
    @Resource
    private DataDictionaryService dataDictionaryService;
    @RequestMapping(value = "/applist")
    public String applist(AppInfo appInfo, String pageIndex, HttpServletRequest request){
        Map<String,Object> map  = appInfoServiceImpl.showAppInfo(pageIndex, appInfo);
        List<AppCategory>categoryLevel1List = getCategoryList(null);
        request.setAttribute("categoryLevel1List",categoryLevel1List);
        List<AppCategory>categoryLevel2List = getCategoryList(appInfo.getCategoryLevel1()!=null?appInfo.getCategoryLevel1().toString():"true");
        request.setAttribute("categoryLevel2List",categoryLevel2List);
        List<AppCategory>categoryLevel3List = getCategoryList(appInfo.getCategoryLevel2()!=null?appInfo.getCategoryLevel2().toString():"false");
        request.setAttribute("categoryLevel3List",categoryLevel3List);
        List<DataDictionary>flatFormList = getDataDictionaryList("APP_FLATFORM");
        request.setAttribute("flatFormList", flatFormList);
        request.setAttribute("querySoftwareName", appInfo.getSoftwareName());
        request.setAttribute("queryCategoryLevel1", appInfo.getCategoryLevel1());
        request.setAttribute("queryCategoryLevel2", appInfo.getCategoryLevel2());
        request.setAttribute("queryCategoryLevel3", appInfo.getCategoryLevel3());
        request.setAttribute("queryFlatformId", appInfo.getFlatformId());
        request.setAttribute("Map",map);
        return "/backend/applist";
    }
    public List<AppCategory> getCategoryList(String parentId){
        if ("true".equals(parentId)){
            return appCategoryService.showAppCategeryAll(parentId);
        }else if ("false".equals(parentId)){
            return appCategoryService.showAppCategeryAll(parentId);
        }
        return appCategoryService.showAppCategory(parentId!=null?Integer.parseInt(parentId):null);
    }
    public List<DataDictionary>getDataDictionaryList(String typeCode){
        return dataDictionaryService.showDataDictionaryList(typeCode);
    }
    /**
     * 根据parentId查询出相应的分类级别列表
     * @param integer
     * @return
     */
    @RequestMapping(value="/categorylevellist",method= RequestMethod.GET,produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getAppCategoryList (@RequestParam String integer){
        return JSONArray.toJSONString(getCategoryList(integer));
    }
    @RequestMapping(value = "/appcheck")
    public String checkApp(){
        return "";
    }
}
