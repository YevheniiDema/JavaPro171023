package de.telran.module_1.hw_06_20240201.task3;
/*Вы владелец концертного зала со сценой. Вы нанимаете артистов
различного жанра, которые развлекают зрителей, используя свои
таланты. Реализуйте класс Концерт, в котором разные артисты будут
 выходить на сцену и развлекать зрителей используя свои умения и
 талант. Подумайте,
можно для класса Концерт применить Generiс подход к реализации?  */
public class SimpleConcert {
    public static void main(String[] args) {
        Concert<Dancer> art1 = new Concert<>(new Dancer("Дмитрий Дигусар"));
        art1.artist.performs();
        Concert<Singer> art2 = new Concert<>(new Singer("Павло Зибров"));
        art2.artist.performs();

    }
}
