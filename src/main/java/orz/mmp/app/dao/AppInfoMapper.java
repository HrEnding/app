package orz.mmp.app.dao;

import org.apache.ibatis.annotations.Param;
import orz.mmp.app.pojo.AppInfo;
import orz.mmp.app.pojo.AppInfoExt;

import java.util.List;
import java.util.Map;

public interface AppInfoMapper {
    /**
     * 查询数据库中数据，进行分页以及级联查询
     * @param map
     * @return
     */
    List<AppInfoExt>getAppInfoList(Map map);

    /**
     * 计算进行查询数的总数
     * @param appInfo
     * @return
     */
    int totalWhereRecode(AppInfo appInfo);

    /**
     * 查询审核APP信息
     * @param id
     * @param APKName
     * @return
     */
    AppInfoExt getAppInfo(@Param("id") Integer id ,@Param("APKName") String APKName);

    /**
     * 根据Id改变app审核转态
     * @param status
     * @param id
     * @return
     */
    int updateStatus(@Param("status")Integer status,@Param("id")Integer id);
}
