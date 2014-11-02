package com.test.server;

import com.test.servlet.FirstServlet;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.*;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;

public class SimplestServer {
    public static void main(String[] args) throws Exception {
        String jetty_home = System.getProperty("jetty.home","./src/main/webapp");

        Server server = new Server();

        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8080);
        server.addConnector(connector);

        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setDirectoriesListed(true);
        resourceHandler.setWelcomeFiles(new String[] {"/index.html"});
        resourceHandler.setResourceBase(".");

        HandlerList handlers = new HandlerList();
        handlers.addHandler(resourceHandler);
        handlers.addHandler(new DefaultHandler());

        ContextHandler context = new ContextHandler();
        context.setContextPath("/myapp");
        context.setResourceBase(".");
        context.setClassLoader(Thread.currentThread().getContextClassLoader());
        context.setHandler(new HelloHandler());

        ServletContextHandler servletContext = new ServletContextHandler(ServletContextHandler.SESSIONS);
        servletContext.setContextPath("/jettyApp");
        servletContext.addServlet(new ServletHolder(new FirstServlet()), "/*");
        servletContext.addServlet(new ServletHolder(new FirstServlet("Rahul")),"/rahul");

        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/webapp");
        webAppContext.setWar(jetty_home);

        ContextHandlerCollection contextHandlerCollection = new ContextHandlerCollection();
        contextHandlerCollection.setHandlers(new Handler[] {context, servletContext, webAppContext});
        server.setHandler(contextHandlerCollection);

        server.start();
        server.join();
    }
}
