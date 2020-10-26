package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());


        for (int i = 1; i <= n; i++) {

            int number = i;

            int sumOfDigits = 0;

            while (number > 0) {

                sumOfDigits += number % 10;

                number /= 10;

            }

            String special = "";

            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) {

                special = "True";

            } else {

                special = "False";

            }

            System.out.printf("%d -> %s%n", i, special);
            
        }

    }
}
