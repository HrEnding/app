package orz.mmp.app.service.backend;

import orz.mmp.app.pojo.AppInfo;

import java.util.Map;

public interface AppInfoService {
    Map<String,Object> showAppInfo(String num, AppInfo appInfo);
}
