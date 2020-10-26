package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arrMain = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = Integer.parseInt(in.nextLine());
        int[] arr1 = new int[arrMain.length];

        for (int i = 0; i < arrMain.length; i++) {

            int mainArrIndex = i + n;

            while (mainArrIndex > arrMain.length - 1){
                if (mainArrIndex > arrMain.length - 1){
                    mainArrIndex -= arrMain.length;
                }
            }

            arr1[i] = arrMain[mainArrIndex];
        }



        for (int num : arr1){
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

//1 2 3 4 5 -> 2 3 4 5 1
//2 3 4 5 1 -> 3 4 5 1 2
//
//arrMain = {1, 2, 3, 4, 5}
//arr1 = {2, 3, 4, 5, 1}
//arr2 = {3, 4, 5, 1, 2}
//
//if n = 1
//
//arr1[0] = arrMain[0 + n]
//arr1[1] = arrMain[1 + n]
//arr1[2] = arrMain[2 + n]
//arr1[3] = arrMain[3 + n]
//arr1[4] = arrMain[4 + n]
//
//int newArrIndex = i + n;
//if (newArrIndex > arrMain.Length - 1) => newArrLength -= arrMain.Length;
//
//5 => index = 5 - 5 = 0
//6 => index = 6 - 5 = 1

