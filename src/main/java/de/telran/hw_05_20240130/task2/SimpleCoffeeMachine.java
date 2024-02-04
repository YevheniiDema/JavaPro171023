package de.telran.hw_05_20240130.task2;
/*У вас на работе есть один кофейный автомат. Он умеет готовить
развличные виды кофе. Но он только один.
Реализуйте класс кофейного автомата, с помощью которого любой
человек может приготовить себе различные варианты кофе.
Но что важно, сколько ко бы раз не обращался человек за
 кофе, или какие бы люди не пытались приготовить кофе, они всегда
 получали бы ссылку на один и тот же объект кофейного автомата.
(Поищите информацию в интернете о паттерне Singleton и попытайтесь
его реализовать при решении данной задачи.
Можно использовать вариант реализации со статическим методом и приватным конструктором,
или вариант реализации через Enum.)  */
public class SimpleCoffeeMachine {
    public static void main(String[] args) {

        CoffeeMachine.INSTANCE.cappuccino();
//        System.out.println(CoffeeMachine.INSTANCE.cappuccino());
        CoffeeMachine.INSTANCE.latte();
        CoffeeMachine.INSTANCE.espresso();

    }
}
