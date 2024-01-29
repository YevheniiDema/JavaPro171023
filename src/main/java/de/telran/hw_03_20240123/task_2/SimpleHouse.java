package de.telran.hw_03_20240123.task_2;
/*2) Есть класс Дом и в нем живет много объектов типа Житель.
У Дома так же есть объекты Крыша, Стены, Окна, Двери.
Создайте класс для сущности Дом и ассоциированные с ним объекты, входящий в него.
Подумайте какие из них агрегируются с домом, а какие связаны отношением Композиция.*/
public class SimpleHouse {
    public static void main(String[] args) {
        Doors doors = new Doors(15);
        Roof roof = new Roof("Черепица");
        Walls walls = new Walls("пеноблок");
        Windows windows = new Windows(20);

        House house = new House(roof, walls, doors, windows);

        Inhabitant inhabitant1 = new Inhabitant("Анатолий");
        Inhabitant inhabitant2 = new Inhabitant("Николай");

        house.addInhabitants(inhabitant1);
        house.addInhabitants(inhabitant2);

        house.house();

    }
}
