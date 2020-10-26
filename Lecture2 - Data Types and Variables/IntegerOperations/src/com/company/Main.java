package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());

        int b = Integer.parseInt(in.nextLine());

        long result = a + b;

        int c = Integer.parseInt(in.nextLine());

        result /= c;

        int d = Integer.parseInt(in.nextLine());


        result *= d;

        System.out.println(result);

    }
}
