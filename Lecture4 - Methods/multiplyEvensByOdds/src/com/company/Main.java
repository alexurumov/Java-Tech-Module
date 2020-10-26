package com.company;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public Main() {
    }

    static int sumOfOddDigits(int n) {
        String number = String.valueOf(n);
        int[] nums = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
        int oddSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                oddSum+= nums[i];
            }
        }

        return oddSum;
    }

    static int sumOfEvenDigits(int n) {
        String number = String.valueOf(n);
        int[] nums = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenSum+= nums[i];
            }
        }

        return evenSum;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        n = Math.abs(n);

        int product = sumOfEvenDigits(n) * sumOfOddDigits(n);

        System.out.println(product);

    }
}
