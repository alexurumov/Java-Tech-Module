package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = Integer.parseInt(in.nextLine());

        int number2 = number;

        int result = 1;

        int sum = 0;

        String str = Integer.toString(number);

        int length = str.length();

            for (int i = 1; i <= length; i++) {

                int new_number = number2 % 10;
                int rem_number = number2 / 10;

                for (int j = 2; j <= new_number; j++) {

                    result *= j;

                }

                sum += result;

                result = 1;

                number2 = rem_number;

            }

        if (sum == number) {

            System.out.println("yes");

        } else {

            System.out.println("no");

        }

    }
}
