package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String letter = in.nextLine();

        if (letter == (letter.toLowerCase())) {

            System.out.println("lower-case");

        } else {

            System.out.println("upper-case");

        }

    }
}
