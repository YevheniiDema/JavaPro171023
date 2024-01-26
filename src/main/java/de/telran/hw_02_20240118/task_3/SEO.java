package de.telran.hw_02_20240118.task_3;

public class SEO extends Executive{
    public SEO(String name, int age, String position, int salary) {
        super(name, age, position, salary);
    }

    public void scopeOfWork() {
        System.out.println("SEO " + getName() + " руководит компанией");
    }
}
