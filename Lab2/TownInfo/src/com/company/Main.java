package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String town = in.nextLine();
        int population = Integer.parseInt(in.nextLine());
        int area = Integer.parseInt(in.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", town, population, area);


    }
}
