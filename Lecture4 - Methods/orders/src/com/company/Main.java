package com.company;

import java.util.Scanner;

public class Main {

    public static void orders(String product, int quantity) {
        switch (product) {
            case "water": System.out.printf("%.2f", 1.00 * quantity); break;
            case "coffee": System.out.printf("%.2f", 1.50 * quantity); break;
            case "coke": System.out.printf("%.2f", 1.40 * quantity); break;
            case "snacks": System.out.printf("%.2f", 2.00 * quantity); break;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String product = in.nextLine();
        int quantity = Integer.parseInt(in.nextLine());

        orders(product, quantity);

    }
}
