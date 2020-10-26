package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            int[] newArr = Arrays
                    .stream(in.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if(i % 2 == 0) {
                arr1[i] = newArr[0];
                arr2[i] = newArr[1];
            } else {
                arr1[i] = newArr[1];
                arr2[i] = newArr[0];
            }

        }
        for (int num : arr1){
            System.out.print(num + " ");
        }

        System.out.println();
        for (int num : arr2){
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
