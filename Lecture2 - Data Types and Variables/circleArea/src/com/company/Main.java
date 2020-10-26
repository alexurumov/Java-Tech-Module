package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double raduis = Double.parseDouble(in.nextLine());

        double area = Math.PI * raduis * raduis;

        System.out.printf("%.12f", area);


    }
}
