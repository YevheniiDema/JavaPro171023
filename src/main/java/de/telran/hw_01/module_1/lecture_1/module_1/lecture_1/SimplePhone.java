package de.telran.hw_01.module_1.lecture_1.module_1.lecture_1;
/*2.Класс Phone.
Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.*/
public class SimplePhone {
        public static void main(String[] args) {

            Phone phone1 = new Phone("123-456-789", "Nokia", 0.125);
            Phone phone2 = new Phone("987-654-321", "Siemens", 0.15);
            Phone phone3 = new Phone("555-888-999", "Motorolla", 0.25);

            // Выводим на консоль значения переменных для каждого объекта
            System.out.println("Phone 1: Number - " + phone1.getNumber() + ", Model - " + phone1.getModel() + ", Weight - " + phone1.getWeight());
            System.out.println("Phone 2: Number - " + phone2.getNumber() + ", Model - " + phone2.getModel() + ", Weight - " + phone2.getWeight());
            System.out.println("Phone 3: Number - " + phone3.getNumber() + ", Model - " + phone3.getModel() + ", Weight - " + phone3.getWeight());

            // Вызываем метод receiveCall для каждого объекта
            phone1.receiveCall("John");
            phone2.receiveCall("Michael");
            phone3.receiveCall("Anna");
        }

    }




