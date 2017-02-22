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

    public static Orientation get(char orientation) {
        switch (orientation) {
            case 'N':
                return N;
            case 'E':
                return E;
            case 'W':
                return W;
            case 'S':
                return S;
            default:
                return N;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
