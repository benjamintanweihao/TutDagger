package io.benjamintan.tutdagger.model;

public class Motor {
    private int rpm;

    public Motor() {
        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void accerlarate(int value) {
        rpm += value;
    }

    public void brake() {
        rpm = 0;
    }
}
