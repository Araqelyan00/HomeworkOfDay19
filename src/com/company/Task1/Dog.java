package com.company.Task1;
import com.company.Task1.Animal;

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
