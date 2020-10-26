package com.company;

import java.util.Scanner;

public class Main {

    public static void printInWords(double grade) {

        String gradeInWords = "";

        if (grade >= 2 && grade <= 2.99) {
            gradeInWords = "Fail";
        } else if (grade >= 3 && grade <= 3.49) {
            gradeInWords = "Poor";
        } else if (grade >= 3.50 && grade <= 4.49) {
            gradeInWords = "Good";
        } else if (grade >= 4.50 && grade <= 5.49) {
            gradeInWords = "Very good";
        } else if (grade >= 5.50 && grade <= 6) {
            gradeInWords = "Excellent";
        }

        System.out.println(gradeInWords);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        printInWords(Double.parseDouble(in.nextLine()));
    }
}
