package org.example;

public class ClassNew {

    public static void main(String[] args) {

        //Print numbers from 1 to 10, but stop if you reach 7:
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }

        String[] cars = {"Volvo", "BMW", "Ford"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+ " ");
        }
    }
}



