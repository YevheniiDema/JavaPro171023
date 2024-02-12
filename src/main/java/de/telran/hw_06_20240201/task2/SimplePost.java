package de.telran.module_1.hw_06_20240201.task2;
/*У вас есть на почте коробка, у которой есть 3 характеристики:
 высота, длина и ширина. В коробку вы можете положить любой объект
 (главное чтобы он влез по габаритам) и его отправить по почте или
 получить по почте.
Как Вы думаете, можем ли мы использовать для создания данного класса
Generic подход? Если да, попробуйте реализовать данный класс.*/
public class SimplePost {
    public static void main(String[] args) {
        Box<CoffeeMachine> box1 = new Box<>(15.0, 25.0, 35.0);
        CoffeeMachine coffeMachine = new CoffeeMachine(35.0, 25.0, 20);
        box1.putItem(coffeMachine);
        box1.getItem(coffeMachine);
    }
}
