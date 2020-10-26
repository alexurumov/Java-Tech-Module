package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= n; i++) {

            int sumOfDigits = 0;

            int digits = i;

            while (digits > 0) {

                sumOfDigits += digits % 10;

                digits /= 10;

            }

            String special = "";

            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) {

                special = "True";

            } else {

                special = "False";

            }

            System.out.println(i + " -> " + special);

        }

    }
}
