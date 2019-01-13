package orz.mmp.app.controller.developer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import orz.mmp.app.pojo.DevUser;
import orz.mmp.app.service.developer.DevUserService;
import orz.mmp.app.tools.Constants;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/devLoginController")
public class DevUserController {
    @Resource
    private DevUserService devUserService;
    /**
     * 点击后台管理系统入口，跳转到登录页面
     * @return
     */
    @RequestMapping(value = "/login")
    public String login(){
        return "devlogin";
    }

    /**
     * 进行登录判定操作
     * @param devCode   账号
     * @param devPassword   密码
     * @param request
     * @param session
     * @return
     */
    @RequestMapping(value = "/doLogin")
    public String doLogin(String devCode, String devPassword, HttpServletRequest request, HttpSession session){
        DevUser devUser = devUserService.doLogin(devCode,devPassword);
        if (devUser!=null){
            //放入session
            session.setAttribute(Constants.DEV_USER_SESSION, devUser);
            //页面跳转（main.jsp）
            return "redirect:/devLoginController/flatform/main";
        }else{
            //页面跳转（login.jsp）带出提示信息--转发
            request.setAttribute("message", "用户名或密码不正确");
            return "devlogin";
        }
    }

    /**
     * 登录成功页面跳转
     * 当session中内容丢失的时候跳转到登录页面
     * @param session
     * @return
     */
    @RequestMapping(value="/flatform/main")
    public String main(HttpSession session){
        if(session.getAttribute(Constants.DEV_USER_SESSION) == null){
            return "redirect:/devLoginController/login";
        }
        return "developer/main";
    }

    /**
     * 进行账号注销操作
     * @param session
     * @return
     */
    @RequestMapping(value="/logout")
    public String logout(HttpSession session){
        //清除session
        session.removeAttribute(Constants.DEV_USER_SESSION);
        return "devlogin";
    }
}
