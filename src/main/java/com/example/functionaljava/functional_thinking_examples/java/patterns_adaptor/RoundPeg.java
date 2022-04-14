package com.example.functionaljava.functional_thinking_examples.java.patterns_adaptor;

public class RoundPeg implements Circularity {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public RoundPeg(int radius) {
        this.radius = radius;
    }
}
