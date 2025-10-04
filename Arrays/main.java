package com.raj;

public class main {
    public static void main(String[] args) {

        // Syntax
        // datatype[] variable name = new datatype[size];
        // store 5 roll nos
       // int[] rollnos = new int[5];
        // or directly
       // int[] rollnos = {23, 45, 67, 42, 54};

        int[] rollnos; //declaration of array, rollnos is getting defind in the stack
        rollnos = new int[5]; //initialisation : actually here object is being created in the heap

        //System.out.println(rollnos[1]);

        String[] arr = new String [4];
        System.out.println(arr[0]);

        for(String element : arr){
            System.out.println(element);
        }


    }
}
