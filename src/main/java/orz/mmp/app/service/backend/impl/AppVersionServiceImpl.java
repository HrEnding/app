package orz.mmp.app.service.backend.impl;

import org.springframework.stereotype.Service;
import orz.mmp.app.dao.AppVersionMapper;
import orz.mmp.app.pojo.AppVersion;
import orz.mmp.app.service.backend.AppVersionService;

import javax.annotation.Resource;

@Service
public class AppVersionServiceImpl implements AppVersionService {
    @Resource
    private AppVersionMapper appVersionMapper;

    public AppVersion getAppVersionById(Integer id) {
        return appVersionMapper.getAppVersionById(id);
    }
}
