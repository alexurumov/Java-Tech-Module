package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double money = Double.parseDouble(in.nextLine());

        double cost = 0;

        double spent = 0;

        while (money != 0) {

            String game = in.nextLine();

            if (game.equals("OutFall 4")) {

                cost = 39.99;

            } else if (game.equals("CS: OG")) {

                cost = 15.99;

            } else if (game.equals("Zplinter Zell")) {

                cost = 19.99;

            } else if (game.equals("Honored 2")) {

                cost = 59.99;

            } else if (game.equals("RoverWatch")) {

                cost = 29.99;

            } else if (game.equals("RoverWatch Origins Edition")) {

                cost = 39.99;

            } else if (game.equals("Game Time")){

                System.out.printf("Total spent: $%.2f. Remaining money: $%.2f", spent, money); break;

            } else {

                System.out.println("Not Found");

                continue;

            }

            if (cost <= money) {

                System.out.println("Bought " + game);

                money -= cost;

                spent += cost;

            } else {

                System.out.println("Too Expensive");

            }

            if (money == 0) {

                System.out.println("Out of money!"); break;

            }

        }

    }
}
