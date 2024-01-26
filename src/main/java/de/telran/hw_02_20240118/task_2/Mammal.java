package de.telran.hw_02_20240118.task_2;

public class Mammal extends Animal{
    public Mammal(String name, int age) {
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Млекопитающее издает звук");
    }

    public void eat(){
        System.out.println("Млекопитающее в раннем возросте питаются молоком");
    }
}
