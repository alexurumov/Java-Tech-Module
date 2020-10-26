package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] passwords = in.nextLine().split(", ");
        boolean valid = true;
        for (String password : passwords) {
            valid = true;
            if (password.length() < 3 || password.length() > 16) {
                valid = false;
                continue;
            }
            for (int i = 0; i < password.length(); i++) {
                if (!Character.isAlphabetic(password.charAt(i)) && !Character.isDigit(password.charAt(i)) && password.charAt(i) != '-' && password.charAt(i) != '_') {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                System.out.println(password);
            }

        }

    }
}
