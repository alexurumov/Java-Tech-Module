package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        long snowballBest = Long.MIN_VALUE;

        int snow = 0;
        int time = 0;
        int quality = 0;

        for (int i = 1; i <= n ; i++) {

            int snowballSnow = Integer.parseInt(in.nextLine());
            int snowballTime = Integer.parseInt(in.nextLine());
            int snowballQuality = Integer.parseInt(in.nextLine());

                long snowballValue = (long) Math.pow(snowballSnow / snowballTime, snowballQuality);

                if (snowballBest < snowballValue) {

                    snowballBest = snowballValue;
                    snow = snowballSnow;
                    time = snowballTime;
                    quality = snowballQuality;

                }


        }

        System.out.printf("%d : %d = %d (%d)", snow, time, snowballBest, quality);

    }
}
