package com.test.main.camel;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created by Renuka Prasad on 11-01-2015.
 */
public class FirstRouteBuilder extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("file:D:/camel/input?noop=true")
                .process(new LogProcessor())
                .bean(new Transformer(), "transformContent")
                .to("file:D:/camel/output");
    }
}
