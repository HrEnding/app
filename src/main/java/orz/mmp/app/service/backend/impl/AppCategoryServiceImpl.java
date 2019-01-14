package orz.mmp.app.service.backend.impl;

import org.springframework.stereotype.Service;
import orz.mmp.app.dao.AppCategoryMapper;
import orz.mmp.app.pojo.AppCategory;
import orz.mmp.app.service.backend.AppCategoryService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppCategoryServiceImpl implements AppCategoryService {
    @Resource
    private AppCategoryMapper appCategoryMapper;

    public List<AppCategory> showAppCategory(Integer parentId) {
        return appCategoryMapper.getAppCategoryListByParentId(parentId);
    }

    public List<AppCategory> showAppCategeryAll(String integer) {
        System.out.println(integer);
        return appCategoryMapper.getAppCategoryAllByParentId(integer);
    }
}
