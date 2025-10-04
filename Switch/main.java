package com.Raj;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//        if(fruit.equals("mango")){
//            System.out.println("king of fruit");
//        }
//        if(fruit.equals("apple")){
//            System.out.println("a sweet red fruit");
//        }
//        switch (fruit) {
//            case "mango" -> System.out.println("kings of fruit");
//            case "apple" -> System.out.println("a sweet red fruit");
//            case "orange" -> System.out.println("round fruit");
//            case "grapes" -> System.out.println("small fruit");
//            default -> System.out.println("please enter a valid fruit");
//        }
        int Day = in.nextInt();
        switch (Day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thurshday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }

int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("thurshday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }
    }
}







