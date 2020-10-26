package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        Map<String, List<String>> BandsWithMembers = new TreeMap<>();
        Map<String, Integer> BandsWithTimes = new HashMap<>();

        int totalTime = 0;

        while (!line.equals("start of concert")) {

            String[] input = line.split("; ");

            if (input[0].equals("Add")) {

                String band = input[1];
                String[] members = input[2].split(", ");

                BandsWithMembers.putIfAbsent(band, new ArrayList<>());

                for (int i = 0; i < members.length; i++) {
                    if (!BandsWithMembers.get(band).contains(members[i])) {
                        BandsWithMembers.get(band).add(members[i]);
                    }
                }

            } else if (input[0].equals("Play")) {

                String band = input[1];
                int time = Integer.parseInt(input[2]);

                totalTime += time;

                BandsWithTimes.putIfAbsent(band, 0);
                BandsWithTimes.put(band, BandsWithTimes.get(band) + time);

            }

            line = in.nextLine();
        }

        System.out.println("Total time: " + totalTime);

        BandsWithTimes.entrySet().stream().sorted((es1, es2) -> {
            if (Integer.compare(es2.getValue(), es1.getValue()) == 0) {
                return es1.getKey().compareTo(es2.getKey());
            }
            return Integer.compare(es2.getValue(), es1.getValue());
        }).forEach(es -> System.out.println(es.getKey() + " -> " + es.getValue()));

        String finalBand = in.nextLine();
        if (BandsWithMembers.containsKey(finalBand)) {
            System.out.println(finalBand);
            for (String member : BandsWithMembers.get(finalBand)) {
                System.out.println("=> " + member);
            }
        }
    }
}
