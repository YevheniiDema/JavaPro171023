package de.telran.hw_02_20240118.task_2;
/*2*. Создать классы и схему наследования для задачи учета
животных в зоопарке:

Как минимум должен быть общий класс Animal с характеристиками
и поведением, характерными для всех животных.
А дальше уже Ваше творчество, в котором вы должны разбить животных
на группы и подгруппы.*/
public class SimpleAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Carnivore("Tiger", 5);
        animal1.eat();

        Bird bird1 = new Bird("Цапля", 2);
        bird1.eat();

    }
}
