package de.telran.hw_03_20240123.task_3;

public class Auto implements Driver, AutoMechanic{
    private String model;
    private int yearOfIssue;
    private int doors;

    public Auto(String model, int yearOfIssue, int doors) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.doors = doors;
    }

    @Override
    public void carryOutEngineDiagnostics() {

    }

    @Override
    public void checkBrakes() {

    }

    @Override
    public void repairTransmission() {

    }

    @Override
    public void changeOil() {

    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }

    @Override
    public void drive() {

    }
}
