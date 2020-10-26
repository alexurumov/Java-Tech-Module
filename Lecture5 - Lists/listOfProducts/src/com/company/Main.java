package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            products.add(in.nextLine());
        }

        Collections.sort(products);

        for (int i = 1; i <= n ; i++) {
            System.out.println(i + "." + products.get(i - 1));
        }
    }
}
