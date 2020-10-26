package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // read hours and minutes and add 30 to mins

        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine()) + 30;

        // chech if minutes are over 59

        if (minutes > 59){
            hours += 1;
            minutes -= 60;
        }

        // check if hours are over 23

        if (hours > 23){
            hours = 0;
        }


        // check if mins should start with a 0

            if (minutes < 10){
                System.out.printf("%d:0%d", hours, minutes);
            } else {
                System.out.printf("%d:%d", hours, minutes);
            }
    }
}
