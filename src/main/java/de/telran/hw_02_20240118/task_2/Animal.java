package de.telran.hw_02_20240118.task_2;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound(){
        System.out.println("Животное издает звук");
    }
    public void eat() {
        System.out.println("Животное ест");
    }
}
