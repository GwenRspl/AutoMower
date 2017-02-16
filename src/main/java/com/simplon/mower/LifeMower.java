package com.simplon.mower;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LifeMower {

    public static void main(String[] args) {

    }

    public Lawn createLawn() {
        Lawn myLawn = new Lawn();
        try {
            BufferedReader file = new BufferedReader(new FileReader("src/resources/input.txt"));
            String line = file.readLine();
            int width = Character.getNumericValue(line.charAt(0));
            int height = Character.getNumericValue(line.charAt(1));
            myLawn.setWidth(width);
            myLawn.setHeight(height);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return myLawn;
    }

    public ArrayList<Mower> createMower() {
        ArrayList<Mower> mowers = new ArrayList<Mower>();

        try {
            BufferedReader file = new BufferedReader(new FileReader("src/resources/input.txt"));
            String line = file.readLine();
            while ((line = file.readLine()) != null) {
                int horizontal = Character.getNumericValue(line.charAt(0));
                int vertical = Character.getNumericValue(line.charAt(1));
                Orientation orientation = Orientation.N;
                for (Orientation enumOrientation : Orientation.values()) {
                    if (enumOrientation.name.equals(Character.toString(line.charAt(2)))) {
                        orientation = enumOrientation;
                        break;
                    }
                }
                Position position = new Position(horizontal, vertical, orientation);
                line = file.readLine();
                List<Instruction> instructions = new ArrayList<Instruction>();
                for (int i = 0; i < line.length(); i++) {
                    for (Instruction enumInstruction : Instruction.values()) {
                        if (enumInstruction.name.equals(Character.toString(line.charAt(i)))) {
                            instructions.add(enumInstruction);
                        }
                    }
                }
                Mower mower = new Mower(position, instructions);
                mowers.add(mower);
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mowers;
    }

    public String autoMower() {
        LifeMower lifeMower = new LifeMower();
        Lawn myLawn = lifeMower.createLawn();
        ArrayList<Mower> mowers = lifeMower.createMower();

        Position finalPosition;
        String result = "";
        for (Mower mower : mowers) {
            finalPosition = mower.move(myLawn);
            result = result + finalPosition.toString();
        }
        return result;
    }
}
