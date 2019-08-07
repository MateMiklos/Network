package com.emem.network;

public abstract class Device extends Network {

    protected int age;
    protected int batteryLife;

    public abstract void calculateRemainingPower();
}
