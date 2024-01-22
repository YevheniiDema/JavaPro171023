package de.telran.hw_01.module_1.lecture_1.module_1.lecture_1;

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
