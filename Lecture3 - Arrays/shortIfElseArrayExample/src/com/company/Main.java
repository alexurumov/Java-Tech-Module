package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String firstText = in.nextLine();

        String [] firstTextArray = firstText.split(" ");
        int firstLength = firstTextArray.length;
        char[] first = new char[firstLength];

        for (int i = 0; i < firstLength; i++) {

            first [i] = firstTextArray[i].charAt(0);

        }

        String secondText = in.nextLine();

        String [] secondTextArray = secondText.split(" ");
        int secondLength = secondTextArray.length;
        char[] second = new char[secondLength];

        for (int i = 0; i < secondLength; i++) {

            second [i] = secondTextArray[i].charAt(0);

        }

        int smallestLength = Math.min(first.length, second.length);
        char [] smallest = first.length <= second.length
                ? first
                : second;
        char [] biggest = first.length > second.length
                ? first
                : second;

        for (int i = 0; i < smallestLength; i++) {

            if (first[i] < second[i]) {

                smallest = first;
                biggest = second;
                break;

            }
            if (first[i] > second[i]) {

                smallest = second;
                biggest = first;
                break;

            }


        }

        for (int i = 0; i < smallest.length; i++) {

            System.out.print(smallest[i]);

        }

        System.out.println();

        for (int i = 0; i < biggest.length; i++) {

            System.out.print(biggest[i]);

        }

    }
}
