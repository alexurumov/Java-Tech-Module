package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int health = 100;
        int coins = 0;

        String line = in.nextLine();

        String[] arr = line.split("\\|+");

        for (int i = 0; i < arr.length; i++) {
            String[] cmd = arr[i].split("\\s+");
            String found = cmd[0];
            int count = Integer.parseInt(cmd[1]);

            if (found.equals("potion")) {
                if ((health + count) > 100) {
                    System.out.println("You healed for " + (100 - health) + " hp.");
                    health = 100;
                } else {
                    System.out.println("You healed for " + count + " hp.");
                    health += count;
                }
                System.out.println("Current health: " + health + " hp.");
            } else if (found.equals("chest")) {
                System.out.println("You found " + count + " coins.");
                coins += count;
            } else {
                String monster = found;
                if (health - count <= 0) {
                    System.out.println("You died! Killed by " + monster + ".");
                    System.out.println("Best room: " + (i + 1));
                    break;
                } else {
                    health -= count;
                    System.out.println("You slayed " + monster + ".");
                }
            }

            if (i == arr.length - 1) {
                System.out.println("You've made it!");
                System.out.println("Coins: " + coins);
                System.out.println("Health: " + health);
            }
        }


    }
}
