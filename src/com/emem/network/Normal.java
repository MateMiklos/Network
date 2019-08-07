package com.emem.network;

import java.util.ArrayList;
import java.util.List;

public class Normal extends Device {

    private ScreenSize screenSize;
    private int manufacturingYear;

    public Normal(int age, int batteryLife, ScreenSize screenSize, int manufacturingYear) {
        this.age = age;
        this.batteryLife = batteryLife;
        this.screenSize = screenSize;
        this.manufacturingYear = manufacturingYear;
        normalDevices.add(this);
    }

    @Override
    public void calculateRemainingPower() {
        batteryLife -= (3 * age);
        if (manufacturingYear >= 2000) {
            batteryLife *= 2;
        } else {
            batteryLife /= 2;
        }
    }
}
