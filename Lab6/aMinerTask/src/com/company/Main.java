package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();
        int value = Integer.parseInt(in.nextLine());

        LinkedHashMap<String, Integer> miner = new LinkedHashMap<>();

        while (!key.equals("stop")){
            if (!miner.containsKey(key)) {
                miner.put(key, value);
            } else {
                miner.put(key, miner.get(key) + value);
            }

            key = in.nextLine();
            if (key.equals("stop")) {
                break;
            }
            value = Integer.parseInt(in.nextLine());
        }

        for (String resource : miner.keySet()) {
            System.out.printf("%s -> %d", resource, miner.get(resource));
            System.out.println();
        }

    }
}
