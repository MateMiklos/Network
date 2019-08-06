package com.emem.network;

public class Smart extends Device {

    private int actualScreenSize;
    private String uniqueName;
    private ScreenSize screenSize;

    public Smart(int actualScreenSize, String uniqueName) {
        this.actualScreenSize = actualScreenSize;
        this.uniqueName = uniqueName;
    }

    @Override
    public void calculateRemainingPower() {
        this.age++;
        batteryLife -= 15;
        if (this.screenSize.getKey().equals("edtv")) {
            batteryLife -= this.screenSize.getValue();
        }
    }
}
