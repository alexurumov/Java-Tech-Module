package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = Integer.parseInt(in.nextLine());
        int days = Integer.parseInt(in.nextLine());

        double profit = 0;

        for (int i = 1; i <= days; i++) {
            if (i % 10 == 0) {
                size -= 2;
            }
            if (i % 15 == 0) {
                size += 5;
            }

            if (i % 3 == 0) {
                profit -= size * 3;
            }

            if (i % 5 == 0) {
                profit += size * 20;
                if (i % 3 == 0) {
                    profit -= size * 2;
                }
            }

            profit += 50;
            profit -= size * 2;
        }

        System.out.println(size + " companions received " + (int)Math.floor(profit/size) + " coins each.");

    }
}
