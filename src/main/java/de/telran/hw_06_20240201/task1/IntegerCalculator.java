package de.telran.module_1.hw_06_20240201.task1;

public class IntegerCalculator implements Calculator<Integer>{
    public Integer add(Integer a, Integer b){
        return a + b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multi(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer div(Integer a, Integer b) {
        return a / b;
    }
}
