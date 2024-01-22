package de.telran.hw_01.module_1.lecture_1.module_1.lecture_1;

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
