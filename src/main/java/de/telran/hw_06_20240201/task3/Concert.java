package de.telran.module_1.hw_06_20240201.task3;

public class Concert <T extends Artist>{
     T artist;

    public  Concert(T artist) {
        this.artist = artist;
    }

}
