package com.simplon.mower;

import java.util.ArrayList;
import java.util.List;

public class Mower implements IMower {

    private Position position;
    private List<Instruction> instructions = new ArrayList<Instruction>();

    public Mower(Position position, List<Instruction> instructions) {
        this.position = position;
        this.instructions = instructions;
    }

    public void moveForward(Lawn lawn) {
        switch (this.position.getOrientation()) {
            case N:
                if (this.position.getVertical() < lawn.getHeight()) {
                    this.position.setVertical(this.position.getVertical() + 1);
                }
                break;
            case E:
                if (this.position.getHorizontal() < lawn.getWidth()) {
                    this.position.setHorizontal(this.position.getHorizontal() + 1);
                }
                break;
            case W:
                if (this.position.getHorizontal() > 0) {
                    this.position.setHorizontal(this.position.getHorizontal() - 1);
                }
                break;
            case S:
                if (this.position.getVertical() > 0) {
                    this.position.setVertical(this.position.getVertical() - 1);
                }
                break;
        }
    }

    public void turnRight() {
        switch (this.position.getOrientation()) {
            case N:
                this.position.setOrientation(Orientation.E);
                break;
            case E:
                this.position.setOrientation(Orientation.S);
                break;
            case W:
                this.position.setOrientation(Orientation.N);
                break;
            case S:
                this.position.setOrientation(Orientation.W);
                break;
        }
    }

    public void turnLeft() {
        switch (this.position.getOrientation()) {
            case N:
                this.position.setOrientation(Orientation.W);
                break;
            case E:
                this.position.setOrientation(Orientation.N);
                break;
            case W:
                this.position.setOrientation(Orientation.S);
                break;
            case S:
                this.position.setOrientation(Orientation.E);
                break;
        }
    }

    public Position move(Lawn lawn) {
        for (Instruction instruction : this.instructions) {
            switch (instruction) {
                case F:
                    this.moveForward(lawn);
                    break;
                case L:
                    this.turnLeft();
                    break;
                case R:
                    this.turnRight();
                    break;
            }
        }
        return this.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mower mower = (Mower) o;

        if (!position.equals(mower.position)) return false;
        return instructions.equals(mower.instructions);
    }

    @Override
    public int hashCode() {
        int result = position.hashCode();
        result = 31 * result + instructions.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Mower{" +
                "position=" + position +
                ", instructions=" + instructions +
                '}';
    }
}
