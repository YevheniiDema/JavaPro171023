package de.telran.hw_03_20240123.task_2;


public class Windows {
    private int count;

    public Windows(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return " и количеством окон: " + count;
    }
}
