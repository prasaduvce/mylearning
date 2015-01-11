package com.test.main.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelRouteTest {
    public static void main(String[] args) {
        FirstRouteBuilder firstRouteBuilder = new FirstRouteBuilder();
        CamelContext context = new DefaultCamelContext();
        try {
            context.addRoutes(firstRouteBuilder);
            context.start();
            Thread.sleep(5*60*1000);
            context.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
