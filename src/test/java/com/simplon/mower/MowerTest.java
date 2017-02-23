package com.simplon.mower;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class MowerTest {

    @Test
    public void moveForwardFacingNorth() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(1, 2, Orientation.N);
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(Instruction.F);
        Mower mower = new Mower(position, instructions);
        Position positionTest = mower.move(myLawn);
        Position expectedPosition = new Position(1, 3, Orientation.N);
        assertEquals(expectedPosition, positionTest);
    }

    @Test
    public void moveLeftFacingNorth() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(1, 2, Orientation.N);
        List<Instruction> instructions2 = new ArrayList<Instruction>();
        instructions2.add(Instruction.L);
        Mower mower2 = new Mower(position, instructions2);
        Position positionTest2 = mower2.move(myLawn);
        Position expectedPosition2 = new Position(1, 2, Orientation.W);
        assertEquals(expectedPosition2, positionTest2);
    }

    @Test
    public void moveRightFacingNorth() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(1, 2, Orientation.N);
        List<Instruction> instructions3 = new ArrayList<Instruction>();
        instructions3.add(Instruction.R);
        Mower mower3 = new Mower(position, instructions3);
        Position positionTest3 = mower3.move(myLawn);
        Position expectedPosition3 = new Position(1, 2, Orientation.E);
        assertEquals(expectedPosition3, positionTest3);
    }

    @Test
    public void moveForwardOutFacingNorth() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(1, 5, Orientation.N);
        List<Instruction> instructions4 = new ArrayList<Instruction>();
        instructions4.add(Instruction.F);
        Mower mower4 = new Mower(position, instructions4);
        Position positionTest4 = mower4.move(myLawn);
        Position expectedPosition4 = new Position(1, 5, Orientation.N);
        assertEquals(expectedPosition4, positionTest4);
    }

    @Test
    public void MoveForwardFacingEast() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(1, 2, Orientation.E);
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(Instruction.F);
        Mower mower = new Mower(position, instructions);
        Position positionTest = mower.move(myLawn);
        Position expectedPosition = new Position(2, 2, Orientation.E);
        assertEquals(expectedPosition, positionTest);
    }

    @Test
    public void moveLeftFacingEast() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(1, 2, Orientation.E);
        List<Instruction> instructions2 = new ArrayList<Instruction>();
        instructions2.add(Instruction.L);
        Mower mower2 = new Mower(position, instructions2);
        Position positionTest2 = mower2.move(myLawn);
        Position expectedPosition2 = new Position(1, 2, Orientation.N);
        assertEquals(expectedPosition2, positionTest2);
    }

    @Test
    public void moveRightFacingEast() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(1, 2, Orientation.E);
        List<Instruction> instructions3 = new ArrayList<Instruction>();
        instructions3.add(Instruction.R);
        Mower mower3 = new Mower(position, instructions3);
        Position positionTest3 = mower3.move(myLawn);
        Position expectedPosition3 = new Position(1, 2, Orientation.S);
        assertEquals(expectedPosition3, positionTest3);
    }

    @Test
    public void moveForwardOutFacingEast() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(5, 5, Orientation.E);
        List<Instruction> instructions4 = new ArrayList<Instruction>();
        instructions4.add(Instruction.F);
        Mower mower4 = new Mower(position, instructions4);
        Position positionTest4 = mower4.move(myLawn);
        Position expectedPosition4 = new Position(5, 5, Orientation.E);
        assertEquals(expectedPosition4, positionTest4);
    }

    @Test
    public void moveForwardFacingSouth() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(1, 2, Orientation.S);
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(Instruction.F);
        Mower mower = new Mower(position, instructions);
        Position positionTest = mower.move(myLawn);
        Position expectedPosition = new Position(1, 1, Orientation.S);
        assertEquals(expectedPosition, positionTest);
    }

    @Test
    public void moveLeftFacingSouth() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(1, 2, Orientation.S);
        List<Instruction> instructions2 = new ArrayList<Instruction>();
        instructions2.add(Instruction.L);
        Mower mower2 = new Mower(position, instructions2);
        Position positionTest2 = mower2.move(myLawn);
        Position expectedPosition2 = new Position(1, 2, Orientation.E);
        assertEquals(expectedPosition2, positionTest2);
    }

    @Test
    public void moveRightFacingSouth() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(1, 2, Orientation.S);
        List<Instruction> instructions3 = new ArrayList<Instruction>();
        instructions3.add(Instruction.R);
        Mower mower3 = new Mower(position, instructions3);
        Position positionTest3 = mower3.move(myLawn);
        Position expectedPosition3 = new Position(1, 2, Orientation.W);
        assertEquals(expectedPosition3, positionTest3);
    }

    @Test
    public void moveForwardOutFacingSouth() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(5, 0, Orientation.S);
        List<Instruction> instructions4 = new ArrayList<Instruction>();
        instructions4.add(Instruction.F);
        Mower mower4 = new Mower(position, instructions4);
        Position positionTest4 = mower4.move(myLawn);
        Position expectedPosition4 = new Position(5, 0, Orientation.S);
        assertEquals(expectedPosition4, positionTest4);
    }

    @Test
    public void moveForwardFacingWest() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(1, 2, Orientation.W);
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(Instruction.F);
        Mower mower = new Mower(position, instructions);
        Position positionTest = mower.move(myLawn);
        Position expectedPosition = new Position(0, 2, Orientation.W);
        assertEquals(expectedPosition, positionTest);
    }

    @Test
    public void moveLeftFacingWest() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(1, 2, Orientation.W);
        List<Instruction> instructions2 = new ArrayList<Instruction>();
        instructions2.add(Instruction.L);
        Mower mower2 = new Mower(position, instructions2);
        Position positionTest2 = mower2.move(myLawn);
        Position expectedPosition2 = new Position(1, 2, Orientation.S);
        assertEquals(expectedPosition2, positionTest2);
    }

    @Test
    public void moveRightFacingWest() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(1, 2, Orientation.W);
        List<Instruction> instructions3 = new ArrayList<Instruction>();
        instructions3.add(Instruction.R);
        Mower mower3 = new Mower(position, instructions3);
        Position positionTest3 = mower3.move(myLawn);
        Position expectedPosition3 = new Position(1, 2, Orientation.N);
        assertEquals(expectedPosition3, positionTest3);
    }

    @Test
    public void moveForwardOutFacingWest() {
        Lawn myLawn = new Lawn(5, 5);
        Position position = new Position(0, 2, Orientation.W);
        List<Instruction> instructions4 = new ArrayList<Instruction>();
        instructions4.add(Instruction.F);
        Mower mower4 = new Mower(position, instructions4);
        Position positionTest4 = mower4.move(myLawn);
        Position expectedPosition4 = new Position(0, 2, Orientation.W);
        assertEquals(expectedPosition4, positionTest4);
    }


}