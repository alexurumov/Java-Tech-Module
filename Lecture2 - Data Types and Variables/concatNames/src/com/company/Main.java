package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String firstName = in.nextLine();
        String lastName = in.nextLine();
        String delimiter = in.nextLine();

        System.out.println(firstName + delimiter + lastName);

    }
}
