package task1;

import task1.Animal;

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
