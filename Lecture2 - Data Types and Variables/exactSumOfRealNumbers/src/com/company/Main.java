package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <= n ; i++) {

            BigDecimal  number = new BigDecimal(in.nextLine());

            sum = sum.add(number);

        }

        System.out.println(sum);

    }
}
