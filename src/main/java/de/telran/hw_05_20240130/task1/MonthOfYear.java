package de.telran.hw_05_20240130.task1;

public enum MonthOfYear {
    JANUARY("ЯНВАРЬ"),
    FEBRUARY("ФЕВРАЛЬ"),
    MARCH("МАРТ"),
    APRIL("АПРЕЛЬ"),
    MAY("МАЙ"),
    JUNE("ИЮНЬ"),
    JULY("ИЮЛЬ"),
    AUGUST("АВГУСТ"),
    SEPTEMBER("СЕНТЯБРЬ"),
    OCTOBER("ОКТЯБРЬ"),
    NOVEMBER("НОЯБРЬ"),
    DECEMBER("ДЕКАБРЬ");
    private String month;

    MonthOfYear(String month) {
        this.month = month;
    }

    MonthOfYear() {
    }

    @Override
    public String toString() {
        return "Cейчас месяц " + month;
    }


}
