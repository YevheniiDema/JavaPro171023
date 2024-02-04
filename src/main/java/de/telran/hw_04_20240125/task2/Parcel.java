package de.telran.hw_04_20240125.task2;

class Parcel extends Mailing {
    double volume; //обьем посылки

    public Parcel(String nameOfItem, String sendersAdress, String recipientsAdress, double volume) {
        super(nameOfItem, sendersAdress, recipientsAdress);
        this.volume = volume;
    }

    @Override
    void deliver() {
        System.out.println("Доставить посылку " + nameOfItem);
    }

    @Override
    void send() {
        System.out.println("Отправить посылку " + nameOfItem);
    }
}
