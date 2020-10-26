package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = in.nextLine().split(" ");
        String first = strings[0];
        String second = strings[1];
        int sum = 0;

        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                sum += first.charAt(i) * second.charAt(i);
            }
        } else {
            if (first.length() > second.length()) {
                for (int i = 0; i < second.length(); i++) {
                    sum += first.charAt(i) * second.charAt(i);
                }
                for (int i = second.length(); i < first.length(); i++) {
                    sum += first.charAt(i);
                }
            } else {
                for (int i = 0; i < first.length(); i++) {
                    sum += first.charAt(i) * second.charAt(i);
                }
                for (int i = first.length(); i < second.length(); i++) {
                    sum += second.charAt(i);
                }
            }
        }
        System.out.println(sum);
    }
}
