package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int power = Integer.parseInt(in.nextLine());
        int distance = Integer.parseInt(in.nextLine());
        int factor = Integer.parseInt(in.nextLine());

        int targets = 0;
        int currentPower = power;

        while (currentPower >= distance) {

            targets++;
            currentPower -= distance;

            if (currentPower == (power / 2) && factor != 0) {

                currentPower /= factor;

            }

        }

        System.out.println(currentPower);
        System.out.println(targets);

    }
}
