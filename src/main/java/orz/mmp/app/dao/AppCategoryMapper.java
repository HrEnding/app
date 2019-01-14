package orz.mmp.app.dao;

import org.apache.ibatis.annotations.Param;
import orz.mmp.app.pojo.AppCategory;

import java.util.List;

public interface AppCategoryMapper {
    /**
     * 根据父ID查询该父级下所有子类
     * @param parentId
     * @return
     */
    List<AppCategory>getAppCategoryListByParentId(@Param("parentId") Integer parentId);

    List<AppCategory>getAppCategoryAllByParentId(@Param("integer") String integer);
}
