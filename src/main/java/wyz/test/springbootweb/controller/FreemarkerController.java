package wyz.test.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 在springboot中使用freemarker
 * 1、加入依赖
 * 2、默认模板路径为classpath/templates中
 * 
 */
@Controller
@RequestMapping("freemarker")
public class FreemarkerController {

    @RequestMapping("regLogin")
    public String regLogin(String test, Model model){
        model.addAttribute("test",test);
        System.out.println("11111");
        return "regLogin";
    }

}
