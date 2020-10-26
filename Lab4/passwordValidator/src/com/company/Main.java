package com.company;

import java.util.Scanner;

public class Main {

    static boolean validateLength(String pass) {
        if (pass.length() < 6 || pass.length() >10) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }

    static boolean validateChars(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) < '0' || (pass.charAt(i) > '9' && pass.charAt(i) < 'A') || (pass.charAt(i) > 'Z' && pass.charAt(i) < 'a') || pass.charAt(i) > 'z') {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    static boolean validateDigits(String pass) {
        int digits = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                digits++;
            }
        }
        if (digits < 2) {
            System.out.println("Password must have at least 2 digits");
            return false;
        }

        return true;

    }

    static boolean validPass (String pass) {
        boolean correctCharCount = validateLength(pass);
        boolean onlyLettersAndDigits = validateChars(pass);
        boolean haveTwoDigits = validateDigits(pass);

        return correctCharCount && onlyLettersAndDigits && haveTwoDigits;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();

        if (validPass(password)) {
            System.out.println("Password is valid");
        }


    }
}
