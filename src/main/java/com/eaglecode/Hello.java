package com.eaglecode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {

    @Autowired
    private Laptop laptop;

    public void greet() {

        laptop.compile();
        System.out.println("I feel good!");
    }
}
