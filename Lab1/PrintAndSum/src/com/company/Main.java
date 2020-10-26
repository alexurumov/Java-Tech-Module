package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int first = Integer.parseInt(in.nextLine());

        int second = Integer.parseInt(in.nextLine());

        int sum = 0;

        for (int i = first; i <= second; i++) {

            System.out.print(i + " ");

            sum += i;

            if (i == second) {

                System.out.println();
            }

        }

        System.out.println("Sum: " + sum);

    }
}
