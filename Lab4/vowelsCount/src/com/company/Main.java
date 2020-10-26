package com.company;

import java.util.Scanner;

public class Main {

    static void vowelsCount(String input) {
        input = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'e' || input.charAt(i) == 'i') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        vowelsCount(text);

    }
}
