package orz.mmp.app.service.backend.impl;

import org.springframework.stereotype.Service;
import orz.mmp.app.dao.AppInfoMapper;
import orz.mmp.app.pojo.AppInfo;
import orz.mmp.app.pojo.AppInfoExt;
import orz.mmp.app.service.backend.AppInfoService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppInfoServiceImpl implements AppInfoService {
    @Resource
    private AppInfoMapper appInfoMapper;

    public Map<String,Object>showAppInfo(String num, AppInfo appInfo){
        Map<String,Object> map = new HashMap<String, Object>();
        int pageSize = 3;
        //默认首次访问首页
        int pageNumber = 1;
        if(num!=null && num.length()>0){
            pageNumber = Integer.parseInt(num);
        }
        int pageRecode = appInfoMapper.totalWhereRecode(appInfo);
        //计算共有多少页
        int totalPage = pageRecode%pageSize==0?pageRecode/pageSize:pageRecode/pageSize+1;
        //求当前页的内容
        int pageIndex = (pageNumber-1)*pageSize;
        Map<String,Object> hashMap = new HashMap<String, Object>();
        hashMap.put("pageIndex",pageIndex);
        hashMap.put("pageSize",pageSize);
        hashMap.put("appInfo",appInfo);

        List<AppInfoExt> appInfoExtList = appInfoMapper.getAppInfoList(hashMap);
        map.put("total",pageRecode);
        map.put("pageNumber",pageNumber);
        map.put("totalPage",totalPage);
        map.put("appInfoList",appInfoExtList);
        return map;
    }
}
