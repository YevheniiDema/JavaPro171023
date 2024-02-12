package de.telran.module_1.hw_06_20240201.task1;
/*1 уровень сложности: 1. Создайте обобщенный интерфейс для
калькулятора, в котором будут объявлен перечень операций,
которые умеет делать ваш калькулятор add, sub, multi и div
и реализуйте классы, которые будут включать данный интерфейс
для работы с различными типами данных аргументов.*/
public class SimpleCalculator {
    public static void main(String[] args) {
        Calculator<Integer> intCalc1 = new IntegerCalculator();
        System.out.println("Сумма: " + intCalc1.add(2,3));
        System.out.println("Разница: " + intCalc1.sub(2,3));
        System.out.println("Произведение: " + intCalc1.multi(2,3));
        System.out.println("Деление: " + intCalc1.div(2,3));

        Calculator<Double> doubleCalc = new DoubleCalculator();
        System.out.println("Сумма: " + doubleCalc.add(3.3, 5.2));
        System.out.println("Разница: " + doubleCalc.sub(3.3, 5.2));
        System.out.println("Произведение: " + doubleCalc.multi(3.3, 5.2));
        System.out.println("Деление: " + doubleCalc.div(3.3, 5.2));
    }
}
