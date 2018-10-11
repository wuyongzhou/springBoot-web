package wyz.test.springbootweb.exceptionHanding;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHanding {

    @ExceptionHandler(value =Exception.class )
    @ResponseBody
    public String exceptionHandler(Exception e){
        return "this is globalExceptionHandler method，error message:"+e.getMessage();
        //return "fail";
    }
}
