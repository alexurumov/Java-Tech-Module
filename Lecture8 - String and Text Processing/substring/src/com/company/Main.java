package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String removeWord = in.nextLine();
        String text = in.nextLine();
        while (text.contains(removeWord)) {
            text = text.replace(removeWord, "");
        }
        System.out.println(text);

    }
}
