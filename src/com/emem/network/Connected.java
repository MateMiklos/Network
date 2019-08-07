package com.emem.network;

public class Connected extends Device {

    private static int totalNumberOfConnectedDevices;

    public Connected(int age, int batteryLife) {
        this.age = age;
        this.batteryLife = batteryLife;
        totalNumberOfConnectedDevices++;
    }

    @Override
    public void calculateRemainingPower() {
        this.batteryLife -= 7;
        this.batteryLife += 20 * totalNumberOfConnectedDevices;
    }
}
