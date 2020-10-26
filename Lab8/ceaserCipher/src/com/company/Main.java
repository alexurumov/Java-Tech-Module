package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char encrypt = text.charAt(i);
            encrypt += 3;
            encrypted.append(encrypt);
        }
        System.out.println(encrypted);
    }
}
