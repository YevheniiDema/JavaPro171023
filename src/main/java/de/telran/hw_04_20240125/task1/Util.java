package de.telran.hw_04_20240125.task1;

public class Util {


    public static double resultAVG(int num1, int num2){
        return (num1 + num2) / 2.0;
    }

    public static double resultAVG(double num1, double num2){
        return (num1 + num2) / 2.0;
    }
    public static double resultAVG(int num1, double num2){
        return (num1 + num2) / 2.0;
    }

    public static double resultAVG(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return (double) sum / arr.length;
        }
    }

    public static double resultAVG (double[] arr) {
        if (arr.length == 0) {
            return 0;

        } else {
            double sum = 0;
            for (double num : arr) {
                sum += num;
            }
            return sum / arr.length;
        }
    }

    public static int maxValue (int[] arr){
        if (arr.length == 0) {
            return 0;
        } else {
            int max = arr[0];
            for (int num : arr) {
                if(num > max) {
                    max = num;
                }
            }
            return max;
        }
    }

    public static double maxValue(double[] arr) {
        if (arr.length == 0){
            return 0;
        } else {
            double max = arr[0];
            for (double num : arr) {
                if (num > max){
                    max = num;
                }
            }
            return max;
        }
    }

    public static int minValue(int[] arr) {
        if (arr.length == 0){
            return 0;
        } else {
            int min = arr[0];
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
    }

    public static double minValue(double[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            double min = arr[0];
            for (double num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
    }




}
