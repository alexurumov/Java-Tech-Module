package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        if (!text.matches("[d-z,{,},|,#]+")) {

            System.out.println("This is not the book you are looking for.");

        } else {

            StringBuilder decryptedText = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                decryptedText.append((char) (text.charAt(i) - 3));
            }

            String[] changeWords = in.nextLine().split(" ");
            String wordForChange = changeWords[0];
            String replacement = changeWords[1];

            System.out.println(decryptedText.toString().replace(wordForChange, replacement));

        }
    }
}
