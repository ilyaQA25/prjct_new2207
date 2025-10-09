package org.example;

public class Dog extends Animals {

    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Dog(String owner) {
        this.owner = owner;
    }

    public Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Bark bark");
    }

    @Override
    public void info() {
        System.out.print("Age: " + getAge() + "; Name: " + getName() + "; Legs: " + legs + "; Owner: " + owner);
        System.out.println();
    }
}
