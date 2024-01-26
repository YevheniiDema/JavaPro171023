package de.telran.hw_02_20240118.task_3;
/*3*. Вы работаете на предприятии, где работает большое количество сотрудников.
Создайте классы и схему наследования для организационной структуры предприятия:
Базовый класс - Employee с перечнем характеристик и поведением, которые присутствуют у любого сотрудника.
А далее все зависит от подразделений где они работают и их функциональных обязанностей. */
public class SimpleFactory {
    public static void main(String[] args) {
        Employee empl1 = new Employee("Вася", 30, "токарь", 2500);
        empl1.scopeOfWork();
        empl1.employeeIsWorking();

        Manager manager = new Manager("Анатолий" ,40, "Бригадир", 2700);
        manager.scopeOfWork();

        SEO seo = new SEO("Никита Сергеевич", 45, "SEO", 10000);
        seo.scopeOfWork();

    }
}
