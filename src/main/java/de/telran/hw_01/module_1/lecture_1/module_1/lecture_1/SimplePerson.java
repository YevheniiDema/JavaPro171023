package de.telran.hw_01.module_1.lecture_1.module_1.lecture_1;
/*1 уровень сложности: 1.Класс module_1.lecture_1.module_1.lecture_1.Person
Создать класс module_1.lecture_1.module_1.lecture_1.Person, который содержит:
переменные fullName, age;
методы move() и talk(), в которых просто вывести на консоль сообщение
-"Такой-то  module_1.lecture_1.module_1.lecture_1.Person говорит".
Добавьте два конструктора  - module_1.lecture_1.module_1.lecture_1.Person()
и module_1.lecture_1.module_1.lecture_1.Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором
module_1.lecture_1.module_1.lecture_1.Person(), другой - module_1.lecture_1.module_1.lecture_1.Person(fullName, age)*/
public class SimplePerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFullName("John Doe");
        person1.setAge(18);
        person1.talk();
        person1.move();

        Person person2 = new Person("Michael Douglas" , 25);
        person2.talk();
        person2.move();


    }
}
