package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        int sum = 0;

        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {

            String name = in.nextLine();
            for (int j = 0; j < name.length(); j++) {

                char letter = name.charAt(j);
                if (letter == 'a' || letter == 'o' || letter == 'u' || letter == 'e' || letter == 'i') {
                    sum += letter * name.length();
                } else {
                    sum += letter / name.length();
                }

            }

            arr1[i] = sum;
            sum = 0;
        }

        Arrays.sort(arr1);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }


    }
}
