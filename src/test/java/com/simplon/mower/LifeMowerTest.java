package com.simplon.mower;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class LifeMowerTest {

    @Test
    public void createLawnTest() {
        LifeMower lifeMower = new LifeMower();
        Lawn myLawn = lifeMower.createLawn();
        Lawn expectedLawn = new Lawn(5,5);
        assertEquals(expectedLawn, myLawn);
    }

    @Test
    public void createMowerTest() {
        LifeMower lifeMower = new LifeMower();
        ArrayList<Mower> mowers = lifeMower.createMower();

        Position position = new Position(1,2,Orientation.N);
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(Instruction.L);
        instructions.add(Instruction.F);
        instructions.add(Instruction.L);
        instructions.add(Instruction.F);
        instructions.add(Instruction.L);
        instructions.add(Instruction.F);
        instructions.add(Instruction.L);
        instructions.add(Instruction.F);
        instructions.add(Instruction.F);
        Mower mower1 = new Mower(position,instructions);

        Position position2 = new Position(3,3,Orientation.E);
        List<Instruction> instructions2 = new ArrayList<Instruction>();
        instructions2.add(Instruction.F);
        instructions2.add(Instruction.F);
        instructions2.add(Instruction.R);
        instructions2.add(Instruction.F);
        instructions2.add(Instruction.F);
        instructions2.add(Instruction.R);
        instructions2.add(Instruction.F);
        instructions2.add(Instruction.R);
        instructions2.add(Instruction.R);
        instructions2.add(Instruction.F);
        Mower mower2 = new Mower(position2,instructions2);

        ArrayList<Mower> expectedMowers = new ArrayList<Mower>();
        expectedMowers.add(mower1);
        expectedMowers.add(mower2);

        assertEquals(expectedMowers, mowers);
    }

    @Test
    public void autoMowerTest() {
        LifeMower lifeMowerTest = new LifeMower();
        String result = lifeMowerTest.autoMower();
        String expectedResult = "13N 51E ";
        assertEquals(expectedResult,result);
    }
}