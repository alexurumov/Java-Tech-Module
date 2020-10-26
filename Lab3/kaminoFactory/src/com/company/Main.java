package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // input

        Scanner in = new Scanner(System.in);

        int sequenceLength = Integer.parseInt(in.nextLine());
        String line = in.nextLine();
        int bestLength = 0;
        String bestDna = "";
        int bestIndex = 0;
        int bestSum = 0;

        int counter = 0;
        int bestCounter = 0;

        while (!line.equals("Clone them!")) {
            counter++;
            String sequence = line.replaceAll("!", "");

            String[] dnas = sequence.split("0");

            int maxLength = 0;
            int sum = 0;

            String bestLocalDna = "";

            for (int i = 0; i < dnas.length; i++) {
                if (dnas[i].length() > maxLength) {
                    maxLength = dnas[i].length();
                    bestLocalDna = dnas[i];
                }
                sum += dnas[i].length();
            }

            int beginIndex = sequence.indexOf(bestLocalDna);

            if (maxLength > bestLength) {
                bestLength = maxLength;
                bestDna = sequence;
                bestIndex = beginIndex;
                bestSum = sum;
                bestCounter = counter;
            } else if (maxLength == bestLength && (beginIndex < bestIndex || sum > bestSum)) {
                bestLength = maxLength;
                bestDna = sequence;
                bestIndex = beginIndex;
                bestSum = sum;
                bestCounter = counter;
            } else if (counter == 1) {
                bestLength = maxLength;
                bestDna = sequence;
                bestIndex = beginIndex;
                bestSum = sum;
                bestCounter = counter;
            }

            line = in.nextLine();

        }

        System.out.printf("Best DNA sample %d with sum: %d.", bestCounter, bestSum);
        System.out.println();

        for (int i = 0; i < bestDna.length(); i++) {
            System.out.print(bestDna.charAt(i) + " ");
        }
        System.out.println();

    }
}
