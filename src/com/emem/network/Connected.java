package com.emem.network;

public class Connected extends Device {

    private static int totalNumberOfConnectedDevices;

    public Connected() {
        totalNumberOfConnectedDevices++;
        this.age = 0;


    }

    @Override
    public void calculateRemainingPower() {
        this.batteryLife -= 7;
        this.batteryLife += 20 * totalNumberOfConnectedDevices;
    }
}
