package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] banned = in.nextLine().split(", ");
        String text = in.nextLine();
        for (String word : banned) {
            String replacement = "";
            for (int i = 0; i < word.length(); i++) {
                replacement += "*";
            }
            if (text.contains(word)) {
                text = text.replace(word, replacement);
            }
        }
        System.out.println(text);

    }
}
