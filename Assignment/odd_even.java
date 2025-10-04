package com.Raj;


import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = in.nextInt();
        if(num1%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }

    }
}
