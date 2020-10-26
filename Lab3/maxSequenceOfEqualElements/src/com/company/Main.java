package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr1 = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int counter = 1;
        int maxLength = 1;
        int bestIndex = 0;

        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] == arr1[i + 1]) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter > maxLength) {
                maxLength = counter;
                bestIndex = i + 1;
            }
        }

        for (int i = 0; i < maxLength; i++) {
            System.out.print(arr1[bestIndex] + " ");
        }

    }
}
