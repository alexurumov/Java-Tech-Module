package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // to read the grade
        Scanner sc = new Scanner(System.in);
        double grade = Double.parseDouble(sc.nextLine());

        // to check if the grade is higher than 3 and print

        if (grade >= 3.00){
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

    }
}
