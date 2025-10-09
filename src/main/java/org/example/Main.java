package org.example;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //1. Создайте список названий фруктов, добавьте в
        // него "Apple", "Banana", "Orange". Выведите первый и последний элемент списка.
        /*ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(2));*/


        //2. В списке чисел (ArrayList<Integer>)
        // добавьте числа 5, 10, 15, 20. Посчитайте сумму всех элементов списка.

        /*ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        for (int i = 0; i < numbers.len; i++) {*/

        /*int[] arr = {5, 10, 15, 20};
        int sum=0;
        for (int num: arr){
            sum+=num;
        }
        System.out.println(sum);
*/

        /*List<Integer> list = Arrays.asList(3, 4, 7, 8, 10, 13, 14);
        for (int num: list){
            if (num%2==0){
                System.out.println(num);
            }
        }*/
         //Создайте множество (HashSet)
        // чисел и добавьте числа 1, 2, 2, 3, 4. Выведите размер множества.
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        if (numbers.contains(5)){
            System.out.println("5 here");
        }else {
            System.out.println("5 not here");
        }

        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        if (fruits.contains("banana")){
            System.out.println("banana");
        }else {
            System.out.println("not banana");
        }



    }






}

