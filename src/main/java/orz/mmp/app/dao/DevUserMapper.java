package orz.mmp.app.dao;

import org.apache.ibatis.annotations.Param;
import orz.mmp.app.pojo.DevUser;

public interface DevUserMapper {
    /**
     * 开发者用户登录
     * @param devCode 开发者用户账号
     * @param devPassword   开发者用户密码
     * @return  返回登录成功开发者信息
     */
    DevUser doLogin(@Param("devCode") String devCode,@Param("devPassword") String devPassword);
}
