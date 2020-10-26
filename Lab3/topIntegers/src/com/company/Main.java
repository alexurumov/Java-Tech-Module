package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = Integer.MIN_VALUE;

        String topIntegers = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max){
                max = arr[i];
                topIntegers = arr[i] + " " + topIntegers.substring(0);
            }
        }

        System.out.println(topIntegers);

    }
}
