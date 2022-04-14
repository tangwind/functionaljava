package com.example.functionaljava.functional_thinking_examples.java.patterns_adaptor;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean pegFits(Circularity peg) {
        return peg.getRadius() <= radius;
    }
    
}
