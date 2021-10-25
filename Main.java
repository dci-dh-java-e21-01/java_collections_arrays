package com.hnsreeny;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Collection
        // The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
        int age = 32;
        System.out.println(age);
        //
        String[] names = {"Ali","Olga","Zain","Nancy"};
        System.out.println(names[0]);
        String[] cars = {"BMW","Ford","Audi"};
        System.out.println(cars[2]);
        cars[1] = "Bugatti";
        System.out.println(cars[1]);
        //
        int[][] numbers = {{1,2,3,4},{5,6,7,8}};
        System.out.println(Arrays.toString(numbers[0]));
    }
}
