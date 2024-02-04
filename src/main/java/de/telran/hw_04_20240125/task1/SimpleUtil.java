package de.telran.hw_04_20240125.task1;
/*1. Напишите утилитный класс, в котором реализованы методы получения среднего значения AVG,
максимального MAX и минимального значения MIN из следующих наборов данных:
пары целых чисел
пары дробных чисел
одного целого и одного дробного числа
массива целых чисел
массива дробных чисел

Используйте механизм перегрузки.
*/
public class SimpleUtil {
    public static void main(String[] args) {

        int num1 = 15;
        int num2 = 13;
        double num3 = 2.3;
        double num4 = 2.7;

        int[] myArray = {1, 2, 5, 10, 25, 28};
        double[] myArray2 = {1.2, 2.5, 3.0, 5.5};

        System.out.println("Среднее значение двух целых чисел: " + Util.resultAVG(num1, num2));
        System.out.println("Среднее значение двух дробных чисел: " + Util.resultAVG(num3, num4));
        System.out.println("Среднее значение массива целых чисел: " + Util.resultAVG(myArray));
        System.out.println("Среднее значение массива дробных чисел: " + Util.resultAVG(myArray2));
        System.out.println("Минимальное значение массива целых чисел: " + Util.minValue(myArray));
        System.out.println("Минимальное значение массива дробных чисел: " + Util.minValue(myArray2));
        System.out.println("Максимальное значение массива целых чисел: " + Util.maxValue(myArray));
        System.out.println("Максимальное значение массива дробных чисел: " + Util.maxValue(myArray2));



    }
}
