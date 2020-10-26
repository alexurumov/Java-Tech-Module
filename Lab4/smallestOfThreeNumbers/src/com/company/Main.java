package com.company;

import java.util.Scanner;

public class Main {

    static void printSmallest(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstNum = Integer.parseInt(in.nextLine());
        int secondNum = Integer.parseInt(in.nextLine());
        int thirdNum = Integer.parseInt(in.nextLine());

        printSmallest(firstNum, secondNum,thirdNum);

    }
}
