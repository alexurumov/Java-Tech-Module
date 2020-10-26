package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int [] numbers = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumPlus = 0;
        int sumMinus = 0;

        for (int number:numbers) {
            if (number % 2 == 0) {
                sumPlus += number;
            } else {
                sumMinus += number;
            }
        }

        System.out.println(sumPlus-sumMinus);

    }
}
