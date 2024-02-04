package de.telran.hw_04_20240125.task3;

public class Fish implements Swim{
    String nameOfFish;
    double weight;

    public Fish(String nameOfFish, double weight) {
        this.nameOfFish = nameOfFish;
        this.weight = weight;
    }

    public void swim(){
        System.out.println("Рыба " + nameOfFish + " весом " + weight + " любит плавать.");
    }

    public String getNameOfFish() {
        return nameOfFish;
    }

    public void setNameOfFish(String nameOfFish) {
        this.nameOfFish = nameOfFish;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
