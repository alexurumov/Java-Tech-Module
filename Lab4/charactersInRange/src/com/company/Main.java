package com.company;

import java.util.Scanner;

public class Main {

    static void charactersInRange(char a, char b) {
        if ((int) a < (int) b){
            for (int i = (int) a + 1; i < (int) b; i++) {
                System.out.print((char)i + " ");
            }
        } else {
            for (int i = (int) b + 1; i < (int) a; i++) {
                System.out.print((char)i + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.nextLine().charAt(0);
        char b = in.nextLine().charAt(0);
        charactersInRange(a, b);

    }
}
