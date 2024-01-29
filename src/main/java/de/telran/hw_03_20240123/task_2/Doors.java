package de.telran.hw_03_20240123.task_2;

public class Doors {
    private int count;

    public Doors(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return " с количеством дверей: " + count;
    }
}

