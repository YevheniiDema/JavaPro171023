package de.telran.module_2.hw_08_20240208;

import javax.lang.model.element.Name;
import java.util.*;
import java.util.stream.Collectors;

/*1)
Перебрать ArrayList и вывести все строки, содержащие только буквы.
Перебрать ArrayList и найти самую длинную строку, не содержащую пробелов.
Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.


6*)
Перебрать ArrayList и найти наибольшую возрастающую последовательность элементов.
Перебрать ArrayList и удалить все дубликаты элементов.
Перебрать ArrayList и создать новый список, содержащий только уникальные строки.
Перебрать ArrayList и объединить все строки в одну с использованием разделителя.

*/
public class SimpleList {
    public static void main(String[] args) {
//        Найти сумму всех элементов ArrayList.
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        int sum = 0;
        for (Integer element : integerList) {
            sum += element;
        }
        System.out.println("Сумма всех элементов: " + sum);

//        Перебрать ArrayList и вывести все элементы на экран.
        for (Integer elem : integerList) {
            System.out.println(elem);
        }
//        Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Вася"));
        personList.add(new Person("Коля"));
        personList.add(new Person("Витя"));

        for (Person person : personList) {
            System.out.print(""+ person.getName() + ",");
        }

        System.out.println();

//        Перебрать ArrayList и найти наименьший элемент.
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(5);
        integers.add(1);
        integers.add(18);
        integers.add(4);
        integers.add(12);

        int minValue = integers.get(0);
        for (int i = 0; i < integers.size(); i++) {
            int currentValue = integers.get(i);
            if (currentValue < minValue) {
                minValue = currentValue;
            }
        }
        System.out.println("Наименьший элемент: " + minValue);



        //    Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
        ArrayList<String> names = new ArrayList<>();
        names.add("Коля");
        names.add("Катя");
        names.add("Вася");
        names.add("Витя");

        char letter = 'к';
        int counter = 0;

        for (String name : names) {
            if (name.toLowerCase().charAt(0) == letter){
                counter++;
            }
        }
        System.out.println("Количество элементов: " + counter);

//        Создать ArrayList с объектами вашего собственного класса
//        и удалить все элементы, удовлетворяющие определенному условию.

        ArrayList<Person> person2 = new ArrayList<>();
        person2.add(new Person("Вася"));
        person2.add(new Person("Толя"));
        person2.add(new Person("Виталик"));
        person2.add(new Person("Олег"));

        // Условие: удалить имена, которые заканчиваются на "я"
        person2.removeIf(person -> person.getName().endsWith("я"));

        System.out.println(person2);


//        Перебрать ArrayList и удалить все четные числа.
        ArrayList<Integer> arrayList2 = new ArrayList<>(10);
        arrayList2.addAll(integerList);
        arrayList2.add(5);
        arrayList2.add(6);
        arrayList2.add(7);
        arrayList2.add(8);
        arrayList2.add(9);
        arrayList2.add(10);


        arrayList2.removeIf(el -> el % 2 == 0);

        System.out.println(arrayList2);
//   Перебрать ArrayList и объединить все элементы в одну строку.
        ArrayList<String> helloWorld = new ArrayList<>();
        helloWorld.add("Привет");
        helloWorld.add("дорогой");
        helloWorld.add("мир");
        String result = helloWorld.stream().collect(Collectors.joining());

        System.out.println(result);

//Перебрать ArrayList и найти сумму квадратов всех элементов.
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.addAll(arrayList2);
        System.out.println(arrayList3);
        int sumEl = 0;
        for (Integer el : arrayList3) {
            sumEl += el * el;

        }
        System.out.println(sumEl);

// Перебрать ArrayList и найти самую короткую строку.
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("Привет");
        arrayList4.add("дорогой");
        arrayList4.add("мир");

        String shortestString = arrayList4.get(0);
        for (String el : arrayList4) {
            if (el.length() < shortestString.length()){
                shortestString = el;
            }
        }
        System.out.println("Самая короткая строка: " + shortestString);


//        Перебрать ArrayList и заменить все гласные буквы в каждой строке на символ ''.

                List<String> stringList = new ArrayList<>(Arrays.asList("Коля", "Петя", "Миша"));

                // Замена гласных букв в каждой строке
                for (int i = 0; i < stringList.size(); i++) {
                    String originalString = stringList.get(i);
                    String replacedString =originalString.replaceAll("[аеоиуАЕОИУ]", " ");
                    stringList.set(i, replacedString);
                }
                System.out.println(stringList);

//        Перебрать ArrayList и найти второй по величине элемент.
        List<Integer> intArrayList = new ArrayList<>(Arrays.asList(1,12,35,14,5,61,47,8,91));
        Collections.sort(intArrayList);
        System.out.println(intArrayList.get(1));

//        Перебрать ArrayList и вывести все элементы в обратном порядке.
        intArrayList.sort(Collections.reverseOrder());
        System.out.println(intArrayList);

//        Перебрать ArrayList и вывести все строки, содержащие только буквы.
        ArrayList<String> arrList2 = new ArrayList<>(Arrays.asList("firstname", "second_name", "phone number1", "e mail"));

        String onlyLetters = arrList2.get(0);
        for (String el : arrList2) {
            if (el.matches("[a-zA-Z]+")) {
                System.out.println(el);
            }
        }
//        Перебрать ArrayList и найти самую длинную строку, не содержащую пробелов.
        String longest = arrList2.get(0);
        for (String el : arrList2) {
            if(longest.length() < el.length() && !el.contains(" ")){
                longest = el;
            }
        }
        System.out.println(longest);


//          Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
    }
}

