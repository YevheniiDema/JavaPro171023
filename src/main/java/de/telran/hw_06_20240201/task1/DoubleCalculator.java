package de.telran.module_1.hw_06_20240201.task1;

public class DoubleCalculator implements Calculator<Double>{
    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double sub(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multi(Double a, Double b) {
        return a * b;
    }

    @Override
    public Double div(Double a, Double b) {
        return a / b;
    }
}
