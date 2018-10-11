package wyz.test.springbootweb.tomcat;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/tomcatController")
public class TomcatController {

    @RequestMapping("/tomcatHome")
    @ResponseBody
    public String tomcatHome(){
        return "------ tomcat home -------";
    }
}
