package de.telran.hw_02_20240118.task_2;

public class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Птица издает звук клювиком");
    }

    public void eat(){
        System.out.println(getName() +  " ест клювиком");
    }
}
