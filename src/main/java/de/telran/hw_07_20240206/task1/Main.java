package de.telran.module_2.hw_07_20240206.task1;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

/*1) У вас есть класс DynamicIntArray. Внутри него есть 3 характеристики:

int lenght(реальный размер хранимых данных),
int capacity(размер массива),
массив int размером capacity (arr[capacity]),
константы:

начальный размер массива по умолчанию (DEFAULT_CAPACITY),
% изменения размера массива при автоматическом увеличениию (PROCENT_CHANGE).
Реализуйте 2 конструктора:
по умолчанию (создается массив arr размером DEFAULT_CAPACITY)
с параметром capacity (создается массив arr размер которого передается параметром  capacity).
Реализуйте методы:
add(int element) - добавление элемента в конец (не забывайте про ограничения размера массива).
add(int[] elements) - добавление массива элементов в конец нашего массива(не забывайте про ограничения размера массива).
insert (int index, int element) - вставка элемента в место с нужным индексом (не забывайте про ограничения размера массива
и смещение элементов вправо)
delete (int index) - удаление элемента (не забывайте про смещение элементов влево при операции).
get(int index) - вернуть значение элемента по index
*/
public class Main {
    public static void main(String[] args) {
        // Использование конструктора по умолчанию
        DynamicIntArray dynamicArray1 = new DynamicIntArray();
        dynamicArray1.add(5);
        dynamicArray1.add(10);
        dynamicArray1.add(15);

        System.out.println("Dynamic Array 1:");
        printArray(dynamicArray1);

        // Использование конструктора с пользовательским размером
        DynamicIntArray dynamicArray2 = new DynamicIntArray(5);
        int[] elementsToAdd = {1, 2, 3, 4};
        dynamicArray2.add(elementsToAdd);

        System.out.println("\nDynamic Array 2:");
        printArray(dynamicArray2);

        // Вставка элемента
        dynamicArray2.insert(2, 100);

        System.out.println("\nDynamic Array 2 after insertion:");
        printArray(dynamicArray2);

        // Удаление элемента
        dynamicArray2.delete(3);

        System.out.println("\nDynamic Array 2 after deletion:");
        printArray(dynamicArray2);

        // Получение значения по индексу
        int valueAtIndex = dynamicArray2.get(1);
        System.out.println("\nValue at index 1: " + valueAtIndex);
    }

    private static void printArray(DynamicIntArray dynamicArray) {
        for (int i = 0; i < dynamicArray.getLength(); i++) {
            System.out.print(dynamicArray.get(i) + " ");
        }
        System.out.println();
    }


}
