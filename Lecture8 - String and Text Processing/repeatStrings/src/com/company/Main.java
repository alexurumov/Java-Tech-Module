package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = in.nextLine().split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            int n = word.length();
            for (int i = 0; i < n; i++) {
                result.append(word);
            }
        }
        System.out.println(result);
    }
}
