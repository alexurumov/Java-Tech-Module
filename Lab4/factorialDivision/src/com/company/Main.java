package com.company;

import java.util.Scanner;

public class Main {

    static long factorial(int n) {

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(in.nextLine());
        int num2 = Integer.parseInt(in.nextLine());
        double fact1 = factorial(num1);
        double fact2 = factorial(num2);

        System.out.printf("%.2f", (fact1 / fact2));
    }
}
