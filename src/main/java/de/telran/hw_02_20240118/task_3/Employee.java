package de.telran.hw_02_20240118.task_3;

import de.telran.lesson_02_20240118.abstraction2.Soundable;

public class Employee {
    private String name;
    private int age;
    private String position;
    private int salary;

    public Employee(String name, int age, String position, int salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public void employeeIsWorking(){
        System.out.println(" делает что скажут");
    }

    public void scopeOfWork(){
        System.out.println("Сотрудник " + name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
}
