package com.Raj;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch(empID){
            case 1 :
                System.out.println("Dhritiraj");
                break;
            case 2 :
                    System.out.println("Akramul");
                    break;
            case 3 :
                System.out.println("Emp Number 3 ");
                switch(department){
                    case "IT":
                        System.out.println("IT department");
                    case " Management ":
                        System.out.println("management department");
                    default:
                        System.out.println("no department added");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }

// better way to write
        switch (empID) {
            case 1 -> System.out.println("Dhritiraj");
            case 2 -> System.out.println("Akramul");
            case 3 -> {
                System.out.println("Emp Number 3 ");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                    case " Management ":
                        System.out.println("management department");
                    default:
                        System.out.println("no department added");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
}
