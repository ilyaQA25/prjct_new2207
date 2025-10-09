package org.example;

public class Animals {

    final int legs = 4;
    private String name;
    private double age;



    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void voice(){
        System.out.println("animals sound");
    }

    public void info(){
        System.out.println("age of the animal"+age+". her name is "+name+ ". shes got "+legs + " legs");
    }


}
