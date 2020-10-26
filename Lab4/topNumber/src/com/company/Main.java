package com.company;

import java.util.Scanner;

public class Main {

    static boolean divisibleBy8(int n) {
        boolean isTrue = false;
        int sumOfDigits = 0;
        while (n > 0) {
            sumOfDigits += n % 10;
            n = n / 10;
        }
        if (sumOfDigits % 8 == 0) {
            isTrue = true;
        }
        return isTrue;
    }

    static boolean hasOneOdd(int n) {
        boolean isTrue = false;
        while (n > 0) {
            if ((n % 10) % 2 == 1){
                isTrue = true;
                break;
            }
            n = n / 10;
        }
        return isTrue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= n; i++) {
            if (divisibleBy8(i) && hasOneOdd(i)) {
                System.out.println(i);
            }
        }

    }
}
