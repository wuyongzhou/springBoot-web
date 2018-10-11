package wyz.test.springbootweb.servletConfig;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

//@SpringBootConfiguration
public class ServletConfiguration {

    @Bean
    public ServletRegistrationBean createBookServlet(){
        ServletRegistrationBean servletRegistrationBean=new ServletRegistrationBean(new Book(),"/book.do");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean createBookFilter(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new BookFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/book.do"));
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean createBookListener(){
        ServletListenerRegistrationBean servletListenerRegistrationBean=new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new BookListener());
        return servletListenerRegistrationBean;
    }

}
