package de.telran.hw_05_20240130.task2;

public class CoffeeMachine {
    private CoffeeMachine() {
    }

    public static final CoffeeMachine INSTANCE = new CoffeeMachine();

    public void cappuccino() {
        System.out.println("Ваш капуччино готов");
    }
    public void espresso() {
        System.out.println("Ваш эспрессо готов");
    }

    public void latte() {
        System.out.println("Ваш латте готов");
    }

}
