package com.emem.network;

public enum ScreenSize {
    EDTV("edtv", 5),
    HDTV("hdtv", 10),
    FULLHDTV("fullhdtv", 15),
    UHDTV("uhdtv", 20);

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    private final String key;
    private final int value;

    ScreenSize(String key, int value) {
        this.key = key;
        this.value = value;
    }
}
