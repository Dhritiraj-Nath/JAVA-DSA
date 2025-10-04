package com.Raj;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();

    }
   static  void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int a = in.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("The sum of the two number is : "+sum);

    }
}
