package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split("\\s+");
        double result = 0;

        for (int i = 0; i < input.length; i++) {
            String current = input[i];

            char operation1 = current.charAt(0);
            String num = current.substring(1, current.length() - 1);
            double number = Double.parseDouble(num);

            if (Character.isUpperCase(operation1)) {
                int value = (operation1 - 64);
                number = number / value;
            } else {
                int value = (operation1 - 96);
                number = number * value;
            }

            char operation2 = current.charAt(current.length() - 1);
            if (Character.isUpperCase(operation2)) {
                int value = (operation2 - 64);
                number -= value;
            } else {
                int value = (operation2 - 96);
                number += value;
            }
            result += number;
        }
        System.out.printf("%.2f\n", result);
    }
}
