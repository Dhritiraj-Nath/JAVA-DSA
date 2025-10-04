package com.raj;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(234);
//        list.add(90);
//        list.add(78);
//        list.add(43);
//        list.add(8789);
//
//        System.out.println(list.contains(78));
//
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);
//
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }

        //get item at any index

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt(list.get(i))); // psas index here, list[index] syntax do not work here.
        }
            System.out.println(list);


    }
}
