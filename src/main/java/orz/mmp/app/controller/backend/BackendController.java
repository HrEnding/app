package orz.mmp.app.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import orz.mmp.app.pojo.BackendUser;
import orz.mmp.app.pojo.BackendUserExt;
import orz.mmp.app.service.backend.BackendUserService;
import orz.mmp.app.tools.Constants;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/userLoginController")
public class BackendController {

    @Resource
    private BackendUserService backendUserService;

    /**
     * 点击后台管理系统入口，跳转到登录页面
     * @return
     */
    @RequestMapping(value = "/login")
    public String login(){
        return "backendlogin";
    }

    /**
     * 进行登录判定操作
     * @param userCode 账号
     * @param userPassword  密码
     * @param request
     * @param session
     * @return
     */
    @RequestMapping("/doLogin")
    public String doLoging(String userCode, String userPassword, HttpServletRequest request, HttpSession session){
        BackendUserExt backendUser = backendUserService.doLogin(userCode,userPassword);

        if (backendUser!=null){
            //放入session
            session.setAttribute(Constants.USER_SESSION, backendUser);
            //页面跳转（main.jsp）
            return "redirect:/userLoginController/backend/main";
        } else {
            //页面跳转（login.jsp）带出提示信息--转发
            request.setAttribute("message", "用户名或密码不正确");
            return "backendlogin";
        }
    }

    /**
     * 登录成功页面跳转
     * 当session中内容丢失的时候跳转到登录页面
     * @param session
     * @return
     */
    @RequestMapping(value="/backend/main")
    public String main(HttpSession session){
        if(session.getAttribute(Constants.USER_SESSION) == null){
            return "redirect:/userLoginController/login";
        }
        return "backend/main";
    }

    /**
     * 进行账号注销操作
     * @param session
     * @return
     */
    @RequestMapping(value="/logout")
    public String logout(HttpSession session){
        //清除session
        session.removeAttribute(Constants.USER_SESSION);
        return "backendlogin";
    }
}
