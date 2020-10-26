package com.company;

import java.util.Scanner;

public class Main {

    static boolean palindrome(String number) {
        boolean isTrue = false;
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) == number.charAt(number.length() - 1 - i)) {
                isTrue = true;
            } else
                isTrue = false;
            break;
        }
        return isTrue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        while (!line.equals("END")) {
            System.out.println(palindrome(line));
            line = in.nextLine();
        }
    }
}
