package com.eaglecode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {

    @Autowired  //field injection
   private Computer comp;

    /*public void Hello(Laptop laptop){
        this.laptop = laptop;
    }*/

    // Setter Method/ Mutator
   /* @Autowired
    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }*/


    public void greet() {

        comp.compile();
        System.out.println("I feel good!");
    }
}
