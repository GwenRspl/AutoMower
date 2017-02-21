package com.simplon.mower;

public enum Orientation {
    N("N"),
    E("E"),
    W("W"),
    S("S");

    String name = "";

    Orientation(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
