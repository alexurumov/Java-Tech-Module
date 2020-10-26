package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Map<String, Integer> key = new HashMap<>();
        key.put("shards", 0);
        key.put("fragments", 0);
        key.put("motes", 0);
        Map<String, Integer> other = new HashMap<>();

        boolean obtained = false;

        while (!obtained) {
            String[] input = in.nextLine().split(" ");
            for (int i = 1; i < input.length; i += 2) {
                String material = input[i].toLowerCase();
                int quantity = Integer.parseInt(input[i - 1]);
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    key.put(material, key.get(material) + quantity);
                    if (key.get(material) >= 250) {
                        obtained = true;
                        if (material.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                            key.put(material, key.get(material) - 250);
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                            key.put(material, key.get(material) - 250);
                        } else if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                            key.put(material, key.get(material) - 250);
                        }
                        break;
                    }
                } else {
                    if (!other.containsKey(material)) {
                        other.put(material, quantity);
                    } else {
                        other.put(material, other.get(material) + quantity);
                    }
                }
            }
        }

        key.entrySet().stream().sorted((e1, e2) -> {
            int res = e2.getValue().compareTo(e1.getValue());
            if (res == 0) {
                res = e1.getKey().compareTo(e2.getKey());
            }
            return res;
        }).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        other.entrySet().stream().sorted((e1, e2) -> {
            int res =  e1.getKey().compareTo(e2.getKey());
            return res;
        }).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

    }
}
