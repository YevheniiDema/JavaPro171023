package de.telran.hw_02_20240118.task_1;
/*1. У нас в доме живут домашние животные. Попробуйте в этой задаче создать класс Pet
и записать ему в наследники Cat и Dog. Определите, какие характеристики и поведение ваших питомцев
общие, а какие проявляются только у конкретного типа.
*/
public class SimplePet {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурка", 5);
        Dog dog1 = new Dog("Барсик", 2);

        cat1.makeSound();
        dog1.makeSound();
        System.out.println();

        cat1.behaviour();
        dog1.secure();
    }
}
