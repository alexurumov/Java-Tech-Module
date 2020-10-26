package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int energy = 100;
        int coins = 100;

        String line = in.nextLine();

        String[] arr = line.split("\\|+");

        for (int i = 0; i < arr.length; i++) {
            String[] orders = arr[i].split("\\-+");
            String order = orders[0].toLowerCase();
            int count = Math.abs(Integer.parseInt(orders[1]));

            if (order.equals("rest")) {
                if ((energy + count) > 100) {
                    System.out.println("You gained " + (100 - energy) + " energy.");
                    energy = 100;
                } else {
                    System.out.println("You gained " + count + " energy.");
                    energy += count;
                }
                System.out.println("Current energy: " + energy + ".");
            } else if (order.equals("order")) {
                if (energy < 30) {
                    System.out.println("You had to rest!");
                    energy += 50;
                } else {
                    coins += count;
                    energy -= 30;
                    System.out.println("You earned " + count + " coins.");
                }
            } else {
                String product = order;
                if (coins - count <= 0) {
                    System.out.println("Closed! Cannot afford " + product + ".");
                    break;
                } else {
                    coins -= count;
                    System.out.println("You bought " + product + ".");
                }
            }

            if (i == arr.length - 1) {
                System.out.println("Day completed!");
                System.out.println("Coins: " + coins);
                System.out.println("Energy: " + energy);
            }
        }


    }
}
