package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        Map<String, Integer> usersAndResults = new HashMap<>();
        Map<String, Integer> languages = new HashMap<>();

        while (!line.equals("exam finished")) {
            String[] cmd = line.split("-");
            if (cmd.length == 3) {
                String user = cmd[0];
                String language = cmd[1];
                int points = Integer.parseInt(cmd[2]);
                usersAndResults.put(user, points);
                languages.putIfAbsent(language, 0);
                languages.put(language, languages.get(language) + 1);

            } else {
                String user = cmd[0];
                usersAndResults.remove(user);
            }
            line = in.nextLine();
        }
        System.out.println("Results: ");
        usersAndResults.entrySet().stream().sorted((es1, es2) -> {
            int count1 = es1.getValue();
            int count2 = es2.getValue();
            if (count1 == count2) {
                return es1.getKey().compareTo(es2.getKey());
            }
            return Integer.compare(count2, count1);
        }).forEach(es -> {
            System.out.println(es.getKey() + " | " + es.getValue());
        });

        System.out.println("Submissions: ");
        languages.entrySet().stream().sorted((es1, es2) -> {
            int count1 = es1.getValue();
            int count2 = es2.getValue();
            if (count1 == count2) {
                return es1.getKey().compareTo(es2.getKey());
            }
            return Integer.compare(count2, count1);
        }).forEach(es -> {
            System.out.println(es.getKey() + " - " + es.getValue());
        });

    }
}
