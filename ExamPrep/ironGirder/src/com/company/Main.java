package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Map<String, Integer> townsWithTimes = new HashMap<>();
        Map<String, Integer> townsWithPassengers = new HashMap<>();

        while (!input.equals("Slide rule")) {

            String[] data = input.split(":");
            String town = data[0];
            String[] secondPart = data[1].split("->");
            int passengers = Integer.parseInt(secondPart[1]);

            if (input.contains("ambush")) {

                if (townsWithTimes.containsKey(town)) {
                    townsWithTimes.put(town, 0);
                    townsWithPassengers.put(town, townsWithPassengers.get(town) - passengers);
                }

            } else {
                int time = Integer.parseInt(secondPart[0]);


                if (!townsWithTimes.containsKey(town)) {
                    townsWithTimes.put(town, time);
                    townsWithPassengers.put(town, passengers);
                } else {
                    if(townsWithTimes.get(town) > time || townsWithTimes.get(town) == 0) {
                        townsWithTimes.put(town, time);
                    }
                    townsWithPassengers.put(town, townsWithPassengers.get(town) + passengers);
                }

            }

            input = in.nextLine();
        }

        townsWithTimes.entrySet().stream().sorted((a, b) -> {
            if (a.getValue().compareTo(b.getValue()) == 0) {
                return a.getKey().compareTo(b.getKey());
            }
                return a.getValue().compareTo(b.getValue());

        }).forEach(entry -> {
            if(entry.getValue() != 0 && townsWithPassengers.get(entry.getKey()) > 0)
            System.out.println(String.format("%s -> Time: %d -> Passengers: %d", entry.getKey(), entry.getValue(), townsWithPassengers.get(entry.getKey())));
        });
    }
}
