package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        boolean negative = false;
        if (number.charAt(0) == '-') {
            negative = true;
            number = number.substring(1);
        }
        int multiplier = Integer.parseInt(in.nextLine());
        if (multiplier == 0) {
            System.out.println(0);
            return;
        }
        String result = "";
        int remainder = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(number.charAt(i));
            int product = digit * multiplier + remainder;
            int intoResult = product % 10;
            result += intoResult;
            remainder = product / 10;
        }
        if (remainder != 0) {
            result += remainder;
        }
        StringBuilder reversed = new StringBuilder();
        if (negative) {
            reversed.append('-');
        }
        for (int i = result.length() - 1; i >= 0 ; i--) {
            reversed.append(result.charAt(i));
        }
        System.out.println(reversed);
    }
}
