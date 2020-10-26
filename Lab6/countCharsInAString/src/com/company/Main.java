package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        LinkedHashMap<Character, Integer> counts = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter != ' '){
                if (!counts.containsKey(letter)) {
                    counts.put(letter, 1);
                } else {
                    counts.put(letter, counts.get(letter) + 1);
                }
            }

        }

        for (Character letter : counts.keySet()) {
            System.out.printf("%c -> %s", letter, counts.get(letter));
            System.out.println();
        }
    }
}
