package orz.mmp.app.dao;

import org.apache.ibatis.annotations.Param;
import orz.mmp.app.pojo.BackendUserExt;

public interface BackEndUserMapper {
    /**
     * 后台开发者登陆
     * @param userCode 后台管理员账号
     * @param userPassword 后台管理员密码
     * @return 返回登陆成功的后台用户
     */
    BackendUserExt doLogin(@Param("userCode") String userCode, @Param("userPassword") String userPassword);
}
