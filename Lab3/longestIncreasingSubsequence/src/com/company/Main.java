package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] inputRow = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxSequence = 0;
        int currentLength = 1;
        int currentIndex = 0;
        int previousIndex = 0;

        int[] lis = new int[inputRow.length];

        for (int i = 0; i < inputRow.length; i++) {
            if (i == 0) {
                currentLength = 1;
                currentIndex = 0;
                previousIndex = -1;
                lis[0] = inputRow[0];
            } else {

                if (inputRow[i] > inputRow[currentIndex]) {
                    currentLength++;
                    previousIndex = currentIndex;
                    currentIndex = i;
                    lis[i] = inputRow[currentIndex];

                } else {
                    for (int j = lis.length - 1; j > 0; j--) {
                        if (inputRow[i] > inputRow[j - 1]){
                            currentIndex = inputRow[i];
                            lis[j - 1] = inputRow[i];
                        }
                    }

                }

            }

        }
        System.out.println();
    }
}
