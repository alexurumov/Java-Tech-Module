package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        while (!line.equals("end")) {

            if (!line.matches("[A-Z][a-z'\\s]+:[A-Z\\s]+")) {
                System.out.println("Invalid input!");
            } else {

                String[] input = line.split(":");
                String artist = input[0];
                int key = artist.length();

                String encrypted = "";
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ':') {
                        encrypted += '@';
                        continue;
                    }

                    if (line.charAt(i) == ' ' || line.charAt(i) == '\'') {
                        encrypted += line.charAt(i);
                        continue;
                    }

                    if (Character.isUpperCase(line.charAt(i))) {
                        char encryptedChar = (char) (line.charAt(i) + key);

                        if (encryptedChar > 'Z') {
                        encrypted += (char) (encryptedChar - 26);

                        } else {
                            encrypted += encryptedChar;
                        }

                    } else if (Character.isLowerCase(line.charAt(i))) {

                        char encryptedChar = (char) (line.charAt(i) + key);

                        if (encryptedChar > 'z') {
                            encrypted += (char) (encryptedChar - 26);

                        } else {
                            encrypted += encryptedChar;
                        }
                    }

                }

                System.out.println("Successful encryption: " + encrypted);

            }

            line = in.nextLine();
        }


    }
}
