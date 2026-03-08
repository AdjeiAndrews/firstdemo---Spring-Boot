package com.eaglecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstdemoApplication {

    public static void main(String[] args) {

       ApplicationContext context = SpringApplication.run(FirstdemoApplication.class, args);

        Hello name = context.getBean(Hello.class);
        name.greet();
    }

}
