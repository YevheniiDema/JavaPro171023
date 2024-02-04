package de.telran.hw_04_20240125.task3;

public class Boat implements Swim{
    double speed;

    public Boat(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void swim(){
        System.out.println("Лодка плывет со скоростью " + speed + " миль в час" );
    }
}
