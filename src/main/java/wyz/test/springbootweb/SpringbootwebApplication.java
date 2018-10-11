package wyz.test.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 更换Web容器
 * 1、排除Tomcat依赖
 * 2、添加Jetty依赖
 *
 * Spring Boot 静态资源
 * 默认路径为 classpath:[/META-INF/resources/, /resources/, /static/, /public/]
 * 可通过spring.resources.staticLocations或者spring.resources.static-locations设置存放位置
 *
 * Spring Boot Servlet
 * 方法一
 * 1、编写servlet对应类，使用对应的servlet注解
 * 2、@ServletComponentScan 用于扫描Servlet相关的注解
 *
 * 方法二
 * 1、编写servlet对应类
 * 2、创建一个配置类，将servlet类以一个bean的形式纳入spring容器
 *  servlet->ServletRegistrationBean
 *  filter->FilterRegistrationBean
 *  listener->ServletListenerRegistrationBean
 *
 *  拦截器的使用
 *  1、创建拦截器类并实现HandlerInterceptor接口
 *  2、创建一个类，将这个类作为配置类，继承WebMvcConfigurerAdapter抽象类，重写addInterceptors方法，将拦截器类添加进入其中
 *
 *  异常处理
 *  去掉springBoot自带异常处理（ErrorMvcAutoConfiguration），排除ErrorMvcAutoConfiguration.class
 *  自定义异常处理逻辑
 *  创建一个类，实现ErrorPageRegistrar接口，在registerErrorPages方法中指定错误类型以及对应的处理页面
 *
 *  全局异常处理
 *  1、创建类，加上@ControllerAdvice注解
 *  2、写一个异常处理方法，使用@ExceptionHandler注解修饰方法，可根据value值定义具体的异常处理
 *  可以对系统中发生的异常进行处理
 *
 *  局部异常处理
 *  在controller类中定义一个方式，使用@ExceptionHandler注解修饰该方法，可根据value值定义具体的异常处理
 *  这个异常处理方法仅仅能对当前controller类中出现的异常进行处理
 *
 *  注意：
 *  局部异常处理方法优先级高于全局异常处理方法
 *
 *  定义优化Tomcat容器两种方法
 *  1、定义一个类，实现EmbeddedServletContainerCustomizer接口，在customize方法中执行具体操作
 *  2、在配置类中装配EmbeddedServletContainerFactory对象，并执行具体操作
 *
 *  源码类EmbeddedServletContainerAutoConfiguration
 *
 */
//@ServletComponentScan
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
public class SpringbootwebApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext=SpringApplication.run(SpringbootwebApplication.class, args);
    }
}
