package com.example.javafirstlab.Task2;

public class SumBetweenVisitor implements Operation{
    @Override
    public double visit(SmartDoubleArray sda) {
        int size = sda.getSize();
        int leftIndex = -1;
        int rightIndex = size -1;
        double finalSum = 0;
        // Looking for leftmost positive number
        for(int i = 0 ; i < size; i++){
            if(sda.getAt(i) >= 0){
                leftIndex = i;
                break;
            }
            if(i == size - 1) return 0;
        }
        // Looking for rightmost positive number
        for(int i = size - 1; i > leftIndex; i--){
            if(sda.getAt(i) >= 0){
                rightIndex = i;
                break;
            }
        }
        // Checking for absence of two positive numbers
        if(sda.getAt(leftIndex) < 0       ||
                sda.getAt(rightIndex) < 0 ||
                rightIndex - leftIndex == 1){
            return 0;
        }
        // Summing up slice of array between the two
        for(int i = leftIndex + 1; i < rightIndex; i++){
            finalSum += sda.getAt(i);
        }
        return finalSum;
    }
}
