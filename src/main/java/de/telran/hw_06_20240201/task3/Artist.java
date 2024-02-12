package de.telran.module_1.hw_06_20240201.task3;

abstract class Artist {
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void performs();

}
