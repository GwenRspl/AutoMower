package com.simplon.mower;

public class Position {

    private int horizontal;
    private int vertical;
    private Orientation orientation;

    public Position(int horizontal, int vertical, Orientation orientation) {
        this.horizontal = horizontal;
        this.vertical = vertical;
        this.orientation = orientation;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return "" + horizontal + vertical + orientation + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (horizontal != position.horizontal) return false;
        if (vertical != position.vertical) return false;
        return orientation == position.orientation;
    }

    @Override
    public int hashCode() {
        int result = horizontal;
        result = 31 * result + vertical;
        result = 31 * result + orientation.hashCode();
        return result;
    }
}
