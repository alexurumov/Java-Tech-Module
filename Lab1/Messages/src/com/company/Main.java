package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= n ; i++) {

            String input = in.nextLine();

            int number_of_digits = input.length();

            int main_digit = (Integer.parseInt(input) % 10);

            int offset = 0;

            if (main_digit == 8 || main_digit == 9) {

                offset = (main_digit - 2) * 3 + 1;

            } else {

                offset = (main_digit - 2) * 3;

            }

            int letter_index = (offset + number_of_digits - 1) + 97;

            char number = (char) letter_index;

            if (input.equals("0")) {

                System.out.print(" ");

            } else {

                System.out.print(number);

            }

        }

    }
}
