package com.eaglecode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {

    // @Autowired field injection
    Laptop laptop = new Laptop();

    public void Hello(Laptop laptop){
        this.laptop = laptop;
    }


    public void greet() {

        laptop.compile();
        System.out.println("I feel good!");
    }
}
