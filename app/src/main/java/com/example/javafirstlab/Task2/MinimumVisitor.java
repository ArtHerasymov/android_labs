package com.example.javafirstlab.Task2;

public class MinimumVisitor implements Operation {
    @Override
    public double visit(SmartDoubleArray sda) {
        double min = sda.getAt(0);

        for (int i = 1; i < sda.getSize(); i++) {
            double currentElement = sda.getAt(i);
            if (currentElement < min)
                min = currentElement;
        }
        return min;
    }
}