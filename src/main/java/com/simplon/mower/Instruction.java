package com.simplon.mower;

public enum Instruction {
    L("L"),
    R("R"),
    F("F");

    String name = "";

    Instruction(String name) {
        this.name = name;
    }

    public static Instruction get(char instruction) {
        switch (instruction) {
            case 'R':
                return R;
            case 'L':
                return L;
            case 'F':
                return F;
            default:
                return R;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
