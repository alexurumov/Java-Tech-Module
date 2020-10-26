package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        String word2 = new StringBuilder(word).reverse().toString();

        System.out.println(word2);

    }
}
