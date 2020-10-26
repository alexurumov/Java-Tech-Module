package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        LinkedHashMap<String, Double> productPrice = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!line.equals("buy")) {
            String[] input = line.split(" ");
            String product = input[0];
            double price = Double.parseDouble(input[1]);
            int quantity = Integer.parseInt(input[2]);

            productPrice.put(product, price);
            if (productQuantity.containsKey(product)) {
                productQuantity.put(product, productQuantity.get(product) + quantity);
            } else {
                productQuantity.putIfAbsent(product, quantity);
            }

            line = in.nextLine();
            if (line.equals("buy")) {
                break;
            }
        }

        for (String product : productPrice.keySet()) {
            System.out.printf("%s -> %.2f%n", product, (double) productPrice.get(product) * productQuantity.get(product));
        }

    }
}
