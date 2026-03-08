package com.eaglecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Eagle eagle = context.getBean("eagle",Eagle.class);
        eagle.fly();

    }
}
