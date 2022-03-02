package service.impl;

import service.ICalculator;

public class CalculatorImpl implements ICalculator{

    @Override
    public double add(double value1, double value2) {
        return value1 + value2;
    }

    @Override
    public double sub(double value1, double value2) {
        return value1-value2;
    }

    @Override
    public double mul(double value1, double value2) {
        return value1*value2;
    }

    @Override
    public double div(double value1, double value2) {
        return value1/value2;
    }
}
