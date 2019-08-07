package com.emem.network;

public class Smart extends Device {

    private String uniqueName;
    private ScreenSize screenSize;

    public Smart(int age, int batteryLife, ScreenSize screenSize, String uniqueName) {
        this.age = age;
        this.batteryLife = batteryLife;
        this.screenSize = screenSize;
        this.uniqueName = uniqueName;
    }

    @Override
    public void calculateRemainingPower() {
        this.age++;
        batteryLife -= 15;
        if (this.screenSize.getKey().equals("edtv")) {
            batteryLife -= this.screenSize.getValue();
        } else if (this.screenSize.getKey().equals("hdtv")) {
            batteryLife -= this.screenSize.getValue();
        } else if (this.screenSize.getKey().equals("fullhdtv")) {
            batteryLife -= this.screenSize.getValue();
        } else if (this.screenSize.getKey().equals("uhdtv")) {
            batteryLife -= this.screenSize.getValue();
        }
    }

    public int showTheNumberOfNormalDevices(int givenAmount) {
        int numberOfNormalDevices = 0;
        for (Normal normalDevice : normalDevices) {
            if (Math.abs(this.batteryLife - normalDevice.batteryLife) == givenAmount) {
                numberOfNormalDevices++;
            }
        }
        return numberOfNormalDevices;
    }
}
