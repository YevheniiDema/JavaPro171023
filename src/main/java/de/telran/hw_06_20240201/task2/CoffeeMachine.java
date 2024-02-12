package de.telran.module_1.hw_06_20240201.task2;

public class CoffeeMachine extends Item{
    private double height;
    private double length;
    private double width;

    public CoffeeMachine(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
