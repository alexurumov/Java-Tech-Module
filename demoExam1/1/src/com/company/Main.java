package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double budget = Double.parseDouble(in.nextLine());
        int students = Integer.parseInt(in.nextLine());
        double flourPrice = Double.parseDouble(in.nextLine());
        double eggPrice = Double.parseDouble(in.nextLine());
        double apronPrice = Double.parseDouble(in.nextLine());

        int freePackages = students / 5;

        double sum = (flourPrice * (students - freePackages)) + (10 * students * eggPrice) + (apronPrice * Math.ceil(students * 1.2));

        if (sum <= budget) {
            System.out.printf("Items purchased for %.2f$.", sum);
        } else {
            System.out.printf("%.2f$ more needed.", sum - budget);
        }
        
        in.close();

    }
}