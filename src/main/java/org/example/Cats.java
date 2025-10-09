package org.example;

public class Cats extends Animals {

    @Override
    public void voice() {
        System.out.println("miau");
        super.voice();
    }

    @Override
    public void info() {
        super.info();
    }
}
