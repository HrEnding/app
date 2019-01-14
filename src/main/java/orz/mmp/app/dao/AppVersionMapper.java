package orz.mmp.app.dao;

import org.apache.ibatis.annotations.Param;
import orz.mmp.app.pojo.AppVersion;

public interface AppVersionMapper {
    AppVersion getAppVersionById(@Param("id") Integer id);
}
