package de.telran.hw_04_20240125.task2;

abstract class Mailing {
    String nameOfItem;
    String sendersAdress;
    String recipientsAdress;

    public Mailing(String nameOfItem, String sendersAdress, String recipientsAdress) {
        this.nameOfItem = nameOfItem;
        this.sendersAdress = sendersAdress;
        this.recipientsAdress = recipientsAdress;
    }

    abstract void send();
    abstract void deliver();

}
