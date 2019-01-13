package orz.mmp.app.service.developer;

import orz.mmp.app.pojo.DevUser;

public interface DevUserService {
    /**
     * 登录操作
     * @param devCode
     * @param devPassword
     * @return
     */
    DevUser doLogin(String devCode,String devPassword);
}
