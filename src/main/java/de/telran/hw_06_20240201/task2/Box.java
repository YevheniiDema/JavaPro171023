package de.telran.module_1.hw_06_20240201.task2;

public class Box<T extends Item> {
    private double height;
    private double length;
    private double width;


    public Box(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void putItem(T product){
        System.out.println("Товар помещен в коробку");
    }

    public void getItem(T product){
        System.out.println("Товар извлечен из коробки");
    }


}
