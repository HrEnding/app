package orz.mmp.app.service.backend;

import orz.mmp.app.pojo.AppCategory;

import java.util.List;

public interface AppCategoryService {
    List<AppCategory>showAppCategory(Integer parentId);
    List<AppCategory>showAppCategeryAll(String integer);
}
