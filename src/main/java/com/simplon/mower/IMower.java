package com.simplon.mower;

public interface IMower {

    void moveForward(Lawn lawn);
    void turnRight();
    void turnLeft();
    Position move(Lawn lawn);
}
