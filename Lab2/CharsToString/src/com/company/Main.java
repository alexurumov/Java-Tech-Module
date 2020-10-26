package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String out = "";

        for (int i = 1; i <= 3; i++) {

            String input = in.nextLine();

            out += input;

        }

        System.out.println(out);

    }
}
