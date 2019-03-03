package com.example.javafirstlab.Task2;

public class NormalizerVisitor implements Operation  {
    @Override
    public double visit(SmartDoubleArray sda) {
        int pivot = 0;
        int size = sda.getSize();

        for(int i = 0; i < size; i++){
            double current = sda.getAt(i);
            if(current == 0 && i != pivot) {
                double temp = sda.getAt(pivot);
                sda.add(pivot, current);
                sda.add(i, temp);
                pivot++;
            }
        }

        System.out.println(sda.toString());
        return 1;
    }
}
