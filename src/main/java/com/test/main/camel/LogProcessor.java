package com.test.main.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class LogProcessor implements Processor{

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Processing ==> "+exchange.getIn().getBody(String.class));
    }
}
