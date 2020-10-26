package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // insert coins

        double sum = 0.0;

        while (true) {

            String insert = input.nextLine();

            if (insert.equals("0.1") || insert.equals("0.2") || insert.equals("0.5") || insert.equals("1") || insert.equals("2")) {

                double value = Double.parseDouble(insert);

                sum += value;

            } else if (insert.equals("Start")) {

                break;

            } else {

                double value = Double.parseDouble(insert);

                System.out.printf("Cannot accept %.2f%n", value);

            }

        }

        // products

        while (true) {

            String insert2 = input.nextLine();

            if (insert2.equals("Nuts")) {

                BigDecimal price  =  new BigDecimal("2.0");

            } else if (insert2.equals("Water")) {

                BigDecimal price  =  new BigDecimal("0.7");;

            } else if (insert2.equals("Crisps")) {

                BigDecimal price  =  new BigDecimal("1.5");

            } else if (insert2.equals("Soda")) {

                BigDecimal price  =  new BigDecimal("0.8");

            } else if (insert2.equals("Coke")) {

                BigDecimal price  =  new BigDecimal("1.0");

            } else if (insert2.equals("End")) {

                System.out.println("Change: " + sum);

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

