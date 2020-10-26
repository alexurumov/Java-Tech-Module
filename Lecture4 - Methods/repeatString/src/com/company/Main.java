package com.company;

import java.util.Scanner;

public class Main {

    public static String repeatString(String str, int n) {

        String newString = "";

        for (int i = 0; i < n; i++) {
            newString += str;
        }

        return newString;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        int n = Integer.parseInt(in.nextLine());

        System.out.println(repeatString(input, n));

    }
}
