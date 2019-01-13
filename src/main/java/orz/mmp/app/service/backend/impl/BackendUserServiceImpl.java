package orz.mmp.app.service.backend.impl;

import org.springframework.stereotype.Service;
import orz.mmp.app.dao.BackEndUserMapper;
import orz.mmp.app.pojo.BackendUserExt;
import orz.mmp.app.service.backend.BackendUserService;

import javax.annotation.Resource;

@Service
public class BackendUserServiceImpl implements BackendUserService {

    @Resource
    private BackEndUserMapper backEndUserMapper;

    public BackendUserExt doLogin(String userCode, String userPassword) {
        return backEndUserMapper.doLogin(userCode,userPassword);
    }
}
