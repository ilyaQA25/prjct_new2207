package org.example;

public class Class2709 {
        static void myMethod() {
            System.out.println("I just got executed!");
        }

        static int adding(int a, int b){
            System.out.println(a+b);
            return a+b;
        }

        public static void mess(String a){
            System.out.println(a);
        }

    static double adding(double a, double b){
        System.out.println(a+b);
        return a+b;
    }


    public static void main(String[] args) {
        myMethod();
        adding(5.8,6.2);
        mess("new method");


    }
    }


