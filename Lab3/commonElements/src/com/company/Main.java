package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String [] arr1 = in.nextLine().split(" "); // (regex: " ") - splits only by 1 space " "
        String [] arr2 = in.nextLine().split(" "); // (regex: "\\s+") - splits by all of the spaces, not just 1

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i].equals(arr1[j])){
                    System.out.print(arr2[i] + " ");
                    break;
                }
            }
        }
    }
}
