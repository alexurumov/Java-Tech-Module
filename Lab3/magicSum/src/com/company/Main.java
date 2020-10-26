package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = Integer.parseInt(in.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            int base = numbers[i];
            int indexCheck = i + 1;

            while (indexCheck < numbers.length) {
                if (sum - base == numbers[indexCheck]) {
                    System.out.println(base + " " + numbers[indexCheck]);
                    break;
                } else {
                    indexCheck++;
                    continue;
                }
            }
        }

    }
}
