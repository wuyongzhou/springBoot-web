package wyz.test.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import wyz.test.springbootweb.bean.LoginUser;

/**
 *  先检测pom文件中是否有thymeleaf依赖，存在时，会优先到classpath/templates下查找html页面，若找不到直接报错
 *  当只存在embed-jasper依赖时（没有thymeleaf相关依赖，因为会优先使用thymeleaf依赖），会根据application.properties配置文件
 *  的配置项去到指定位置获取页面
 */
@Controller
@RequestMapping("/loginController")
public class LoginController{

    /**
     *  使用html页面，需要导入spring-boot-starter-thymeleaf依赖包，把对应页面放置在templates目录下
     */
    @RequestMapping("htmlLogin")
    public String htmlLogin(@RequestParam String username, @RequestParam String password,Model model) /*throws Exception*/ {
        model.addAttribute("username",username);
        model.addAttribute("password",password);
        if(username.equals(password)){
            //throw new NotFoundException("test");
            return "ok";
        }else{
            System.out.println("错误页面");
            return "fail";
        }
    }

    /**
     * 使用jsp页面，需要导入tomcat-embed-jasper依赖包，页面路径可根据配置文件指定
     */
    @RequestMapping("jspLogin")
    public String jspLogin(Model model,@RequestParam String username, @RequestParam String password){
        model.addAttribute("username",username);
        model.addAttribute("password",password);
        if(username.equals(password)){
            return "ok";
        }else{
            return "fail";
        }
    }


    /**
     * @RequestBody 用于讲json/xml参数转换为bean对象
     * @param model
     * @param loginUser
     * @return
     */
    @RequestMapping("beanlogin")
    @ResponseBody
    public LoginUser beanlogin(Model model,@RequestBody LoginUser loginUser){
        System.out.println(loginUser);
        return loginUser;
    }
}
