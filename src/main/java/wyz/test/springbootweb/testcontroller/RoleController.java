package wyz.test.springbootweb.testcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

/**
 * 表示当前controller的返回值可以直接用于body输出
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @RequestMapping("/show")
    public String show(){
        return "RoleController show";
    }

    @RequestMapping("/error")
    public String error() throws FileNotFoundException {
        throw new FileNotFoundException("----- FileNotFoundException ------");
    }
}
