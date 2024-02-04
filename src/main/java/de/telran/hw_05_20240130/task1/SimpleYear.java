package de.telran.hw_05_20240130.task1;
/*Создайте класса Enum для хранения перечня  месяцев в году.
Кроме костантных значений, в нем должен также сохраняться русское наименование месяца.
Напишите метод, который будет рекомендовать вам режим питания, в зависимости от текущего
 месяца и сезона года.*/

public class SimpleYear {
    public static void main(String[] args) {
        MonthOfYear currentMonth = MonthOfYear.JUNE;
        System.out.println(currentMonth);



            switch (currentMonth){
                case DECEMBER:
                case JANUARY:
                case FEBRUARY:
                    System.out.println("Зимой можно обьедаться");
                    break;
                case MARCH:
                case APRIL:
                case MAY:
                    System.out.println("Весной стоит рационально сократить количество белков и жиров и заменить калорийную животную пищу растительной");
                    break;
                case JUNE:
                case JULY:
                case AUGUST:
                    System.out.println("Летом необходимо есть больше зелени, овощей, фруктов.");
                    break;
                case SEPTEMBER:
                case OCTOBER:
                case NOVEMBER:
                    System.out.println("Питание осенью должно быть сбалансированным, содержать белки, жиры и углеводы, а также большое количество овощей, фруктов и ягод.");
            }


    }
}
