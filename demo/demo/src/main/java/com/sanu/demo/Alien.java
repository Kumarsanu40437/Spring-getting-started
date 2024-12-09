package com.sanu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Autowired;
    Laptop laptop;

    public void code(){
        laptop.compile();//but for this we need an object of laptop
        System.out.println("coding");
    }
}
