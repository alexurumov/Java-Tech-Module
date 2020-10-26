package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // insert coins

        double sum = 0.0;

        BigDecimal sumDecimal = new BigDecimal(sum);

        while (true) {

            String insert = input.nextLine();

            if (insert.equals("0.1") || insert.equals("0.2") || insert.equals("0.5") || insert.equals("1") || insert.equals("2")) {

                double value = Double.parseDouble(insert);

                BigDecimal valueDecimal = new BigDecimal(value);

                sum += value;

            } else if (insert.equals("Start")) {

                break;

            } else {

                double value = Double.parseDouble(insert);

                BigDecimal valueDecimal = new BigDecimal(value);

                System.out.printf("Cannot accept %.2f%n", valueDecimal);

            }

        }

        // products

        while (true) {

            double price = 0.0;

            BigDecimal priceDecimal = new BigDecimal(price);

            String insert2 = input.nextLine();

            if (insert2.equals("Nuts")) {

                price = 2.0;

            } else if (insert2.equals("Water")) {

                price = 0.7;

            } else if (insert2.equals("Crisps")) {

                price = 1.5;

            } else if (insert2.equals("Soda")) {

                price = 0.8;

            } else if (insert2.equals("Coke")) {

                price = 1.0;

            } else if (insert2.equals("End")) {

                System.out.printf("Change: %.2f", sumDecimal);

                break;

            } else {

                System.out.printf("Invalid product%n");

                continue;

            }

            if (sum >= price) {

                System.out.printf("Purchased %s%n", insert2);

                sum = sum - price;

            } else {

                System.out.printf("Sorry, not enough money%n");

            }

        }

    }
}
