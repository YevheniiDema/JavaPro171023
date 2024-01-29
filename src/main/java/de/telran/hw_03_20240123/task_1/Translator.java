package de.telran.hw_03_20240123.task_1;

public class Translator {
    private String name;
    private int age;
    private String sex;

    public Translator(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public void translate(){
        System.out.println(name + " умеет переводить ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
