package com.company.task1;

public class Dog extends Animal {
    @Override
    protected String voice(){
        return "Gaf-Gaf";
    }
    @Override
    protected String eat(){
        return "Dog food";
    }
}
