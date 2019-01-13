package orz.mmp.app.service.backend;

import orz.mmp.app.pojo.BackendUserExt;

public interface BackendUserService {
    /**
     * 登录操作
     * @param userCode
     * @param userPassword
     * @return
     */
    BackendUserExt doLogin(String userCode, String userPassword);
}
