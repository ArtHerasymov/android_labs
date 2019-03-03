package com.example.javafirstlab.Task2;

import java.util.Arrays;

public class SmartDoubleArray implements AbstractWrapper{
    private Double[] doubles = null;

    public SmartDoubleArray(int n) throws IndexOutOfBoundsException{
        if(n <= 0) throw new IndexOutOfBoundsException();
        else this.doubles = new Double[n];
    }

    public SmartDoubleArray(Double [] array){
        this.doubles = array;
    }

    public void add(int index, double value) throws IndexOutOfBoundsException {
        if(index < 0 || index >= doubles.length)
            throw new IndexOutOfBoundsException();
        else
            this.doubles[index] = value;
    }

    public double getAt(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= this.doubles.length)
            throw new IndexOutOfBoundsException();
        else
            return this.doubles[index];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartDoubleArray that = (SmartDoubleArray) o;
        return Arrays.equals(doubles, that.doubles);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(doubles);
    }

    public int getSize(){
        return this.doubles.length;
    }

    @Override
    public String toString() {
        return "SmartDoubleArray{" +
                "doubles=" + Arrays.toString(doubles) +
                '}';
    }

    @Override
    public Double accept(Operation visitor) {
        return visitor.visit(this);
    }
}
