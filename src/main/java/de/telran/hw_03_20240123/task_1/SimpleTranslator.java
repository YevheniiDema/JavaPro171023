package de.telran.hw_03_20240123.task_1;

import de.telran.hw_03_20240123.task_1.EnglishRussian;
import de.telran.hw_03_20240123.task_1.RussianDeutsch;

/*1) Есть абстрактный класс Переводчик, который имеет характеристики имя, возраст, пол и умеет переводить с одного языка на другой.
Реализовать данный класс и создать несколько классов различных переводчиков с одного языка на другой.
Например с английского на русский, с русского на немецки и т.п.
Продумайте какова архитектура наследования будет в данном приложении.*/
public class SimpleTranslator {
    public static void main(String[] args) {
        EnglishRussian englishRussian = new EnglishRussian("Ivan", 18, "male");
        englishRussian.translate();

        RussianDeutsch russianDeutsch = new RussianDeutsch("Helena", 30, "female");
        russianDeutsch.translate();

    }


}
