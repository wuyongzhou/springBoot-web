package wyz.test.springbootweb.servletConfig;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class BookListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("BookListener contextInitialized out");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
