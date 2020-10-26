package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                for (int k = 0; k < n; k++) {

                    char letter1 = (char) ('a' + i);

                    char letter2 = (char) ('a' + j);

                    char letter3 = (char) ('a' + k);

                    System.out.printf("%c%c%c%n", letter1, letter2, letter3);

                }

            }

        }

    }
}
