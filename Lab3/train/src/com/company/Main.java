package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int trainLength = Integer.parseInt(in.nextLine());
        int[] train = new int[trainLength];
        int sum = 0;

        for (int i = 0; i < trainLength; i++) {
            int input = Integer.parseInt(in.nextLine());
            train [i] = input;
            sum += input;
        }

        for (int wagon:train) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
