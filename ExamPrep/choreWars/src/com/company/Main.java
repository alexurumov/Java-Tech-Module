package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        int dishes = 0;
        int cleaning = 0;
        int laundry = 0;

        while (!line.equals("wife is happy")) {

            if (line.contains("{") && line.contains("}")) {

                int begin = line.indexOf("{") + 1;
                int end = line.indexOf("}");

                String data = line.substring(begin, end);

                for (int i = 0; i < data.length(); i++) {
                    if (Character.isDigit(data.charAt(i))) {
                        laundry += data.charAt(i) - '0';
                    }
                }

            } else if (line.contains("<") && line.contains(">")) {

                int begin = line.lastIndexOf("<") + 1;
                int end = line.indexOf(">");

                String data = line.substring(begin, end);

                if (isValidDishes(data)) {
                    for (int i = 0; i < data.length(); i++) {
                        if (Character.isDigit(data.charAt(i))) {
                            dishes += data.charAt(i) - '0';
                        }
                    }
                }
            } else if (line.contains("[") && line.contains("]")) {

                int begin = line.lastIndexOf("[") + 1;
                int end = line.indexOf("]");

                String data = line.substring(begin, end);

                if (isValidCleaning(data)) {
                    for (int i = 0; i < data.length(); i++) {
                        if (Character.isDigit(data.charAt(i))) {
                            cleaning += data.charAt(i) - '0';
                        }
                    }
                }
            }

            line = in.nextLine();
        }

        System.out.println("Doing the dishes - " + dishes + " min.");
        System.out.println("Cleaning the house - " + cleaning + " min.");
        System.out.println("Doing the laundry - " + laundry + " min.");
        System.out.println("Total - " + (laundry + cleaning + dishes) + " min.");

    }

    private static boolean isValidCleaning(String data) {
        for (int i = 0; i < data.length(); i++) {
            if(!Character.isUpperCase(data.charAt(i)) && !Character.isDigit(data.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidDishes(String data) {
        for (int i = 0; i < data.length(); i++) {
            if(!Character.isLowerCase(data.charAt(i)) && !Character.isDigit(data.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
