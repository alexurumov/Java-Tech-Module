package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr1 [] = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int arr2 [] = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = Math.max(arr1.length, arr2.length);
        int sum = 0;

        if (arr1.length != arr2.length){
            System.out.println("Arrays are not of exact length.");
        } else {

            for (int i = 0; i < maxLength; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    sum = 0;
                    break;
                } else {
                    sum += arr1[i];
                }
            }

            if (sum != 0) {
                System.out.printf("Arrays are identical. Sum: %d", sum);
            }
        }
    }
}
