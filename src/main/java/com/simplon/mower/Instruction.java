package com.simplon.mower;

public enum Instruction {
    L("L"),
    R("R"),
    F("F");

    String name = "";

    Instruction(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
