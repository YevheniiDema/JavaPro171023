package de.telran.module_1.hw_06_20240201.task3;
class Singer extends Artist{
    public Singer(String name) {
        super(name);
    }
    public void performs(){
        System.out.println(getName() + " поет");
    }
}
