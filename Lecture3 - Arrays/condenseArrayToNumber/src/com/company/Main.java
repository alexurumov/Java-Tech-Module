package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] numbers = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        if (numbers.length == 1){
            sum = numbers[0];
        }

        while (numbers.length > 1){

            int newArrLength = numbers.length - 1;
            int [] newArr = new int[newArrLength];

            for (int i = 0; i < newArrLength; i++) {
                newArr[i] = numbers[i] + numbers[i + 1];
            }
            numbers = newArr;

            if (newArr.length == 1){
                sum = numbers[0];
                break;
            }

        }
        System.out.println(sum);
    }
}
