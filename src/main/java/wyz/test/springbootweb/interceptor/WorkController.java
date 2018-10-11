package wyz.test.springbootweb.interceptor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkController {

    @RequestMapping("/work/home")
    public String workHome(){
        System.out.println("----- work home -----");
        return "work home";
    }
}
