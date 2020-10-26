package com.company;

import java.util.Scanner;

public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = Integer.parseInt(in.nextLine());
        int second = Integer.parseInt(in.nextLine());
        int third = Integer.parseInt(in.nextLine());

        System.out.println(subtract(add(first, second), third));

    }
}
