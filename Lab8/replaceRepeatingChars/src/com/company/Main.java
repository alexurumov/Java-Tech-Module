package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String result = "";
        char prevSymbl = line.charAt(0);
        result += prevSymbl;
        for (int i = 1; i < line.length(); i++) {
            if (prevSymbl != line.charAt(i)) {
                result += line.charAt(i);
                prevSymbl = line.charAt(i);
            }
        }

        System.out.println(result);
    }
}
