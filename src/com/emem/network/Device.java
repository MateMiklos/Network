package com.emem.network;

public abstract class Device extends Network {

    protected int age;
    protected int batteryLife;
    protected int remainingPower;

    public abstract void calculateRemainingPower();
}
