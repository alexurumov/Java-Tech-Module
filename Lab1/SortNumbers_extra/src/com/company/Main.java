package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = Integer.parseInt(in.nextLine());

        int num2 = Integer.parseInt(in.nextLine());

        int num3 = Integer.parseInt(in.nextLine());

        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println(max);

        if (num1 == max) {

            System.out.println(Math.max(num2, num3));
            System.out.println(Math.min(num2, num3));

        } else if (num2 == max) {

            System.out.println(Math.max(num1, num3));
            System.out.println(Math.min(num1, num3));

        } else if (num3 == max) {

            System.out.println(Math.max(num1, num2));
            System.out.println(Math.min(num1, num2));

        }
    }
}
