package ru.itsjava.iostreams;

import java.io.*;
import java.util.Properties;

public class PropertiesPractice {
    public static void main(String[] args) throws IOException {
//        File file = new File("src/main/resources/application.properties");
//        Properties props = new Properties();
//        props.load(new FileInputStream(file));
//
//        System.out.println("props.getProperty(\"key1\") = " + props.getProperty("key1"));
//
//
//        ClassLoader classLoader = PropertiesPractice.class.getClassLoader();
//        InputStream inputStream = classLoader.getResourceAsStream("application.properties");
//
//        Properties propsFromStream  = new Properties();
//        propsFromStream.load(inputStream);
//
//        System.out.println("propsFromStream.getProperty(\"key1\") = " + propsFromStream.getProperty("key1"));
        ClassLoader classLoader = PropertiesPractice.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("app.properties");
        Properties propertiesApp = new Properties();
        propertiesApp.load(resourceAsStream);
        System.out.println("propertiesApp.getProperty(\"Nikita\") = " + propertiesApp.getProperty("Nikita"));


    }
}
