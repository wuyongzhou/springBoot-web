package wyz.test.springbootweb.tomcat;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class TomcatConfiguration {

    @Bean
    public EmbeddedServletContainerFactory createTomcatEmbeddedServletContainerFactory(){
        TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory=new TomcatEmbeddedServletContainerFactory();
        return tomcatEmbeddedServletContainerFactory;
    }
}
