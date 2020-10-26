package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int meters = Integer.parseInt(in.nextLine());

        double km = (double) meters / 1000.0;

        System.out.printf("%.2f", km);

    }
}
