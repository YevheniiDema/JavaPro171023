package de.telran.hw_04_20240125.task3;
 /*У вас есть интерфейс Swim в котором объявлен метод void swim().
Имплементируйте данный интерфейс в классы:
Human у которого есть свои характеристики имя , возраст.
Fish, характеристики - наименование и вес.
Boat, характеристики - скорость.
Научите данные классы плавать. )
*/
public class SimpleSwim {
    public static void main(String[] args) {
        Human man1 = new Human("Анатолий", 45);
        man1.swim();

        Fish karp = new Fish("Kaрп", 9.0);
        karp.swim();

        Boat titanik = new Boat(20.5);
        titanik.swim();
    }
}
