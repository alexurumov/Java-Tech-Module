package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = in.nextLine().split(" ");

        Random rnd = new Random();
        for (int i = 0; i < words.length; i++) {
            int newPosition = rnd.nextInt(words.length);
            String wordSwitch = words[i];
            words[i] = words[newPosition];
            words[newPosition] = wordSwitch;
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}

