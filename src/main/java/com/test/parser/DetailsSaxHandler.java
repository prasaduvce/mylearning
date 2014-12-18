package com.test.parser;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class DetailsSaxHandler extends DefaultHandler{

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        System.out.println("Start uri ===> "+uri);
        System.out.println("Start localName ===> "+localName);
        System.out.println("Start qName ===> "+qName);
        System.out.println("Start attributes ===> "+attributes);
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        System.out.println("End uri ===> "+uri);
        System.out.println("End localName ===> "+localName);
        System.out.println("End qName ===> "+qName);
    }
}
