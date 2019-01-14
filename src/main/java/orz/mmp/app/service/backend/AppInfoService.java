package orz.mmp.app.service.backend;

import orz.mmp.app.pojo.AppInfo;
import orz.mmp.app.pojo.AppInfoExt;

import java.util.Map;

public interface AppInfoService {

    Map<String,Object> showAppInfo(String num, AppInfo appInfo);

    AppInfoExt getAppInfo(Integer id);

    boolean updateStatus(Integer status,Integer id);
}
