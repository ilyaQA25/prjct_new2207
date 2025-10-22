package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        File text = new File("filename56.txt");
        if (text.exists()) {
            System.out.println(text.canWrite());
            System.out.println(text.canRead());
            System.out.println(text.length());
            System.out.println(text.getAbsoluteFile());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}