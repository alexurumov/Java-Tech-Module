package com.company;

import java.util.Scanner;

public class Main {

    public static double mathPower(double number, int power) {

        double result = 1;

        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double number = Double.parseDouble(in.nextLine());
        int power = Integer.parseInt(in.nextLine());

        System.out.println(mathPower(number, power));

    }
}
