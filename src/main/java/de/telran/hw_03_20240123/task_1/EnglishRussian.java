package de.telran.hw_03_20240123.task_1;

public class EnglishRussian extends Translator {
    private String languages = "c английского на русский и наоборот";
    public EnglishRussian(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void translate(){
        System.out.println(getName() + " умеет переводить " + languages);
    }

    public String getLanguages() {
        return languages;
    }
}
