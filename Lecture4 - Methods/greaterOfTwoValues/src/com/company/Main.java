package com.company;

import java.util.Scanner;

public class Main {

    static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static char getMax(char a, char b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static String getMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine().toLowerCase();

        switch (input) {
            case "int":
                int firstInt = Integer.parseInt(in.nextLine());
                int secondInt = Integer.parseInt(in.nextLine());
                System.out.println(getMax(firstInt, secondInt));
                break;
            case "char":
                char firstChar = in.nextLine().charAt(0);
                char secondChar = in.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String firstStr = in.nextLine();
                String secondStr = in.nextLine();
                System.out.println(getMax(firstStr, secondStr));
                break;
            default:
                break;

        }


    }
}
