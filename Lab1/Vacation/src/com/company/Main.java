package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // input

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String type = in.nextLine();
        String day = in.nextLine();

        double sum = 0.00;

        // type

        if (type.equals("Students")) {

            if (day.equals("Friday")) {

                sum = n * 8.55;

            } else if (day.equals("Saturday")) {

                sum = n * 9.80;

            } else if (day.equals("Sunday")) {

                sum = n * 10.46;

            }
        } else if (type.equals("Business")) {

        if (n >= 100) {

            n -= 10;

        }

            if (day.equals("Friday")) {

                sum = n * 10.90;

            } else if (day.equals("Saturday")) {

                sum = n * 15.60;

            } else if (day.equals("Sunday")) {

                sum = n * 16.00;

            }
        } else if (type.equals("Regular")) {

            if (day.equals("Friday")) {

                sum = n * 15.00;

            } else if (day.equals("Saturday")) {

                sum = n * 20.00;

            } else if (day.equals("Sunday")) {

                sum = n * 22.50;

            }
        }

        // discount

        if (type.equals("Students") && n >= 30) {

            sum *= 0.85;

        }

        if (type.equals("Regular") && n >= 10 && n <= 20) {

            sum *= 0.95;

        }



        System.out.printf("Total price: %.2f", sum);

    }
}
