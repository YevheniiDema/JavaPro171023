package de.telran.module_1.hw_06_20240201.task3;
class Dancer extends Artist{
    public Dancer(String name) {
        super(name);
    }
    public void performs(){
        System.out.println(getName() + " танцует");
    }
}
