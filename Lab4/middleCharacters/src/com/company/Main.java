package com.company;

import java.util.Scanner;

public class Main {

    static void printMiddleChar(String input) {

        if (input.length() % 2 == 0) {
            System.out.print(input.charAt((input.length() - 1) / 2));
            System.out.println(input.charAt((input.length()) / 2));
        } else {
            System.out.println(input.charAt((input.length()) / 2));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        printMiddleChar(input);

    }
}
