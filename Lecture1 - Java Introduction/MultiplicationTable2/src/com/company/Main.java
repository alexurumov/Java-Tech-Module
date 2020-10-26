package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int times = Integer.parseInt(sc.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", number, times, number * times);
            times++;
        } while (times <= 10);
    }
}
