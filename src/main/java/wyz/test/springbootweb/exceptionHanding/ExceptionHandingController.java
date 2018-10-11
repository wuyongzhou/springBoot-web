package wyz.test.springbootweb.exceptionHanding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/exceptionHandingController")
public class ExceptionHandingController {

    @ExceptionHandler(value =ClassCastException.class )
    @ResponseBody
    public String exceptionHandler(Exception e){
        return "this is classExceptionHandler method，error message:"+e.getMessage();
    }

    @RequestMapping("/exceptionError")
    public void exceptionError() throws Exception {
        throw new Exception("----- exceptionError -------");
    }

    @RequestMapping("/classCastExceptionError")
    public void classCastExceptionError() throws ClassCastException {
        throw new ClassCastException("------ classCastExceptionError -------");
    }
}
