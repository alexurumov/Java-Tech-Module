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

        int sumLeft = 0;
        int sumRight =0;
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0){
                sumLeft = 0;
            } else {
                for (int j = 0; j < i; j++) {
                    sumLeft += numbers[j];
                }

            }
            if (i == numbers.length - 1){
                sumRight = 0;
            } else {
                for (int j = i + 1; j < numbers.length; j++) {
                    sumRight += numbers[j];
                }
            }

            if (sumLeft == sumRight) {
                System.out.println(i);
                counter++;
                break;
            } else {
                sumLeft = 0;
                sumRight = 0;
            }

        }
        if (counter == 0) {
            System.out.println("no");
        }

    }
}
