package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        int sum = 0;

        while (n > 0){

            int newNumber = n % 10;

            sum += newNumber;

            n /= 10;

        }

        System.out.println(sum);

    }
}
