package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        int[] firstLineArr = new int[n];
        firstLineArr[0] = 1;

        String firstLineStr = "";
        for (int i = 0; i < firstLineArr.length; i++) {
            firstLineStr += firstLineArr[i] + " ";
        }

        String[] finalArr = new String[n];
        finalArr[0] = firstLineStr;

        int counter = 1;

        int[] currentLineArr = new int[n];
        currentLineArr[0] = 1;
        for (int i = 1; i < currentLineArr.length; i++) {
            currentLineArr[i] = firstLineArr[i];
        }

        while (counter < n) {

            int[] nextLineArr = new int[n];
            nextLineArr[0] = 1;

            for (int i = 1; i < nextLineArr.length; i++) {
                nextLineArr[i] = currentLineArr[i - 1] + currentLineArr[i];
            }

            String nextLine = "";
            for (int i = 0; i < nextLineArr.length; i++) {
                nextLine += nextLineArr[i] + " ";
            }

            finalArr[counter] = nextLine;

            for (int i = 0; i < currentLineArr.length; i++) {
                currentLineArr[i] = nextLineArr[i];
            }
            counter++;
        }

        for (int i = 0; i < n; i++) {
            int[] printArr = Arrays
                    .stream(finalArr[i].toString().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int j = 0; j < printArr.length; j++) {
                if (printArr[j] != 0) {
                    System.out.print(printArr[j] + " ");
                }
            }
            System.out.println();
        }

    }
}