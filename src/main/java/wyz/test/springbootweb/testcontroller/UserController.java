package wyz.test.springbootweb.testcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 使用@GetMapping注解的效果和@RequestMapping的效果一样 spring4.3的新特性
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        return "welcome home";
    }

    @ResponseBody
    @GetMapping("/testGetMapping")
    public String testGetMapping(){
        return "test @GetMapping";
    }

    /**
     *  获取url的参数 访问路径的参数名必须和方法参数名一致，否则访问报错
     */
    @ResponseBody
    @PostMapping("{ida}")
    public String display(@PathVariable String ida){
        return "display id=" +ida;
    }

    /**
     * @RequestParam 可以修饰参数，定义是否必须，默认必须
     */
    @ResponseBody
    @PostMapping("login")
    public String login(@RequestParam(required = false) String username, @RequestParam(required = false) String password){
        return "login ======== username:"+username+",password:"+password;
    }
}
