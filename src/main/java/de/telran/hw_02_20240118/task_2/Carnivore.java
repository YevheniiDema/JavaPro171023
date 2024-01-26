package de.telran.hw_02_20240118.task_2;

public class Carnivore extends Mammal{
    public Carnivore(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(getName() +  " питается мясом");
    }
}
