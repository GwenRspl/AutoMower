package com.simplon.mower;

public class Lawn {

    private int width;
    private int height;

    public Lawn() {
    }

    public Lawn(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lawn lawn = (Lawn) o;

        if (width != lawn.width) return false;
        return height == lawn.height;
    }

    @Override
    public int hashCode() {
        int result = width;
        result = 31 * result + height;
        return result;
    }

    @Override
    public String toString() {
        return "Lawn{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
