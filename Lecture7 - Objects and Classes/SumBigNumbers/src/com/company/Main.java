package com.company;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger first = new BigInteger(in.nextLine());
        BigInteger second = new BigInteger(in.nextLine());

        BigInteger sum = first.add(second);

        System.out.println(sum);
    }
}

