package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int startYield = Integer.parseInt(in.nextLine());

        int totalYield = 0;

        int days = 0;

            while (startYield >= 100) {

                totalYield += startYield - 26;

                days++;

                startYield -= 10;

            }

            if (totalYield >= 26) {

                totalYield -= 26;

            }

            System.out.printf("%d%n%d", days, totalYield);



    }
}
