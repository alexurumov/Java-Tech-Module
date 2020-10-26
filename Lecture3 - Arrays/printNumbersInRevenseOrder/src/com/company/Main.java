package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.nextLine());
        }

        for (int i = n - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
