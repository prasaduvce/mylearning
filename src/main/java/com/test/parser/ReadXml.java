package com.test.parser;

import org.springframework.util.ResourceUtils;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadXml {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        ReadXml readXml = new ReadXml();
        System.out.println("Parsing XML file ==> ");
        File file = ResourceUtils.getFile(readXml.getClass().getResource("/details.xml"));

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser parser = saxParserFactory.newSAXParser();
        parser.parse(file, new DetailsSaxHandler());
    }
}
