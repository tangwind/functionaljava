package com.example.functionaljava.functional_thinking_examples.java.patterns_adaptor;

public class SquarePegAdaptor implements Circularity {
    private SquarePeg peg;

    public SquarePegAdaptor(SquarePeg peg) {
        this.peg = peg;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow((peg.getWidth()/2), 2) * 2);
    }

}
