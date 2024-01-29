package de.telran.hw_03_20240123.task_2;

public class Roof {
    private String material;

    public Roof(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return material;
    }
}
