package de.telran.hw_03_20240123.task_2;

import java.util.ArrayList;
import java.util.List;

public class House {
    private Roof roof;  // примеры композиции
    private Walls walls;
    private Doors doors;
    private Windows windows;
    private List <Inhabitant> inhabitants; // пример агрегации

    public House(Roof roof, Walls walls, Doors doors, Windows windows) {
        this.roof = roof;
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.inhabitants = new ArrayList<>();
    }

    public void addInhabitants(Inhabitant inhabitant) {
        inhabitants.add(inhabitant);
    }

    public void house(){
        System.out.println("");
        System.out.println("Дом со стенами из " + walls + ", крышей из " + roof
                +  doors + windows);


        System.out.println("Жители: ");
        for (Inhabitant inhabitant : inhabitants) {
            System.out.println(inhabitant.getName() +" ");
        }
        System.out.println();
    }


}
