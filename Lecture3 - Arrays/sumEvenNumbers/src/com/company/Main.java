package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int [] numbers = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }

        System.out.println(sum);


    }
}
