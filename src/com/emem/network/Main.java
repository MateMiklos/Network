package com.emem.network;

public class Main {

    public static void main(String[] args) {

        Network network = new Network();

        for (int i = 0; i < 5; i++) {
            network.devices.add(new Connected(0, 200));
        }
        for (int i = 0; i < 10; i++) {
            network.devices.add(new Normal(0, 200, ScreenSize.EDTV, 1995 + i));
        }
        network.devices.add(new Smart(0, 200, ScreenSize.EDTV, "uniqueName1"));
        network.devices.add(new Smart(0, 200, ScreenSize.HDTV, "uniqueName2"));
        network.devices.add(new Smart(0, 200, ScreenSize.FULLHDTV, "uniqueName3"));
        network.devices.add(new Smart(0, 200, ScreenSize.UHDTV, "uniqueName4"));
    }
}


