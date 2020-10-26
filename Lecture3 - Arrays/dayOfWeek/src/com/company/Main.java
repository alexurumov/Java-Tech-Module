package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner in = new Scanner(System.in);

        int day = Integer.parseInt(in.nextLine());

        if (day >= 1 && day <= 7) {

            System.out.println(days[day - 1]);

        } else {

            System.out.println("Invalid day!");

        }
    }
}
