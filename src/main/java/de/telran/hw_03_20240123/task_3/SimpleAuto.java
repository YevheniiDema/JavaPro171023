package de.telran.hw_03_20240123.task_3;
/*3) Есть класс Авто со свои набором характеристик и поведения.
Подумайте, какие ресурсы класса Авто могут доступны только Автомеханику, а какие простому Водителю.
Создайте интерфейсы Автомеханик и Водитель, и с их помощью разделите доступ к методам класса Авто.*/
public class SimpleAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW", 2024, 2);
        auto1.drive();
        Driver driver = auto1;
        driver.drive();
        driver.powerOff();
        driver.powerOn();

        AutoMechanic mechanic = auto1;
        mechanic.carryOutEngineDiagnostics();
        mechanic.checkBrakes();
        mechanic.changeOil();




    }
}
