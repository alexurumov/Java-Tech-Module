package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double pounds = Double.parseDouble(in.nextLine());

        double dollars = (double) pounds * 1.31;

        System.out.printf("%.3f", dollars);

    }
}
