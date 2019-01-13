package orz.mmp.app.service.developer.impl;

import org.springframework.stereotype.Service;
import orz.mmp.app.dao.DevUserMapper;
import orz.mmp.app.pojo.DevUser;
import orz.mmp.app.service.developer.DevUserService;

import javax.annotation.Resource;

@Service
public class DevUserServiceImpl implements DevUserService {
    @Resource
    private DevUserMapper devUserMapper;
    public DevUser doLogin(String devCode, String devPassword) {
        return devUserMapper.doLogin(devCode,devPassword);
    }
}
