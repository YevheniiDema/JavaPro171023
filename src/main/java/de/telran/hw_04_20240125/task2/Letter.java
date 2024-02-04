package de.telran.hw_04_20240125.task2;

import javax.crypto.Mac;

class Letter extends Mailing {
    String messageText;
    public Letter(String nameOfItem, String sendersAdress, String recipientsAdress, String messageText) {
        super(nameOfItem, sendersAdress, recipientsAdress);
        this.messageText = messageText;
    }


    void deliver() {
        System.out.println("Доставка письма " + nameOfItem);
    }

    @Override
    void send() {
        System.out.println("Отправка письма " + nameOfItem);
    }

}
