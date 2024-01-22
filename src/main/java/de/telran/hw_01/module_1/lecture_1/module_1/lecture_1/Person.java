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
public class Person {
    private String fullName;
    private  int age;

    public void move() {
        System.out.println(fullName + " идет");
    }
    public void talk() {
        System.out.println(fullName + " говорит");
    }
    Person(){
        System.out.println("Конструктор по умолчанию вызван. Обьект Person создан");
    }
    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
        System.out.println("Параметризарованный конструктор вызван. Обьект Person создан");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
