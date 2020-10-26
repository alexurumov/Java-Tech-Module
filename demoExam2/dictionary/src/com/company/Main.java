package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Map<String, List<String>> wordsWithDefinitions = new TreeMap<>();

        String[] wordsAndDefs = in.nextLine().split(" \\| ");

        for (String pair : wordsAndDefs) {

            String[] wordAndDef = pair.split(": ");
            String word = wordAndDef[0];
            String definition = wordAndDef[1];
            wordsWithDefinitions.putIfAbsent(word, new ArrayList<>());
            wordsWithDefinitions.get(word).add(definition);

        }

        String[] words = in.nextLine().split(" \\| ");

        for (String word : words) {
            if (wordsWithDefinitions.containsKey(word)) {
                System.out.println(word);
                wordsWithDefinitions.get(word).stream().sorted((d1, d2) -> Integer.compare(d2.length(), d1.length())).forEach(d -> System.out.println(" -" + d));
            }
        }

        String line = in.nextLine();
        if (line.equals("List")) {
            System.out.println(String.join(" ", wordsWithDefinitions.keySet()));
        }
    }

}

