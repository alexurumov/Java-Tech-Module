package com.company;

import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        StringBuilder output = new StringBuilder ("");

        for (int i = 1; i <= 3; i++) {

            String input = in.nextLine();

            output.insert(0, (input + " "));

        }

        System.out.println(output);

    }
}
