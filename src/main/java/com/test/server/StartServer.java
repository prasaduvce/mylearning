package com.test.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class StartServer {

    public static void main(String[] args) throws Exception {
        String webAppDirLocation = "src/main/webapp";

        Server server = new Server(8080);
        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/jettyApp");
        webAppContext.setDescriptor(webAppDirLocation+"/WEB-INF/web.xml");
        webAppContext.setResourceBase(webAppDirLocation);

        webAppContext.setParentLoaderPriority(true);
        server.setHandler(webAppContext);

        server.start();
        server.join();
    }

}
