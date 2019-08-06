package com.emem.network;

public class Normal extends Device {

    private int actualScreenSize;
    private int manufacturingYear;

    public Normal(int actualScreenSize, int manufacturingYear) {
        this.actualScreenSize = actualScreenSize;
        this.manufacturingYear = manufacturingYear;
    }

    @Override
    public void calculateRemainingPower() {

    }
}
