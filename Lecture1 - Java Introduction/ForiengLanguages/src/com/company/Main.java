package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String country = sc.nextLine();

        if (country.equals("England")){
            System.out.println("English");
        } else if (country.equals("USA")){
            System.out.println("English");
        } else if (country.equals("Spain")){
            System.out.println("Spanish");
        } else if (country.equals("Argentina")){
            System.out.println("Spanish");
        } else if (country.equals("Mexico")){
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }

    }
}

