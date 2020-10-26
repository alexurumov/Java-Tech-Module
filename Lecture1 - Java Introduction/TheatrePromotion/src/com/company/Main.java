package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String day = sc.nextLine().toLowerCase();

        int age = Integer.parseInt(sc.nextLine());

        int price = 0;

        // row 1

        if (day.equals("weekday")) {

            // column 1 + 3
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 12;
            }
            //column 2
            else if (age > 18 && age <= 64) {
                price = 18;
            }

        // row 2

        } else if (day.equals("weekend")) {

            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 15;
            } else if (age > 18 && age <= 64) {
                price = 20;
            }

        // row 3

        } else if (day.equals("holiday")) {

            if (age >= 0 && age <= 18) {
                price = 5;
            } else if (age > 18 && age <= 64) {
                price = 12;
            } else if (age > 64 && age <= 122) {
                price = 10;
            }
        }

            if (age < 0 || age > 122) {
                System.out.println("Error!");
            } else {
                System.out.println(price + "$");
            }

    }


}
