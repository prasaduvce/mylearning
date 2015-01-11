package com.test.main.camel;

/**
 * Created by Renuka Prasad on 11-01-2015.
 */
public class Transformer {
    public String transformContent(String body) {
        System.out.println("Invoking the transformContent method.");
        String upperCaseContent = body.toUpperCase();
        return upperCaseContent;
    }
}
