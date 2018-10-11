package wyz.test.springbootweb.tomcat;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.stereotype.Component;

/**
 * EmbeddedServletContainerCustomizer接口在springBoot2.0中已被废弃
 */
//@Component
public class MyEmbeddedServletContainerCustomizer implements EmbeddedServletContainerCustomizer {
    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory=(TomcatEmbeddedServletContainerFactory)configurableEmbeddedServletContainer;
        tomcatEmbeddedServletContainerFactory.addConnectorCustomizers(new MyTomcatConnectorCustomizer());
    }
}

class MyTomcatConnectorCustomizer implements TomcatConnectorCustomizer{

    @Override
    public void customize(Connector connector) {
        Http11NioProtocol http11NioProtocol= (Http11NioProtocol) connector.getProtocolHandler();
        http11NioProtocol.setMaxConnections(2000);//设置最大连接数
        http11NioProtocol.setMaxThreads(500);//设置最大线程数
    }
}
