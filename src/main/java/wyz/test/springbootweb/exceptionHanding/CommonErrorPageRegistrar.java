package wyz.test.springbootweb.exceptionHanding;


import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.ErrorPageRegistrar;
import org.springframework.boot.web.servlet.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * 异常处理的一种方式
 */
//@Component
public class CommonErrorPageRegistrar implements ErrorPageRegistrar {
    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        /**
         * 这里的异常页面路径是以当前项目的静态目录为准
         */
        ErrorPage errorPage404=new ErrorPage(HttpStatus.NOT_FOUND,"/404.html");
        ErrorPage errorPage500=new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/500.html");
        registry.addErrorPages(errorPage404,errorPage500);

    }
}
