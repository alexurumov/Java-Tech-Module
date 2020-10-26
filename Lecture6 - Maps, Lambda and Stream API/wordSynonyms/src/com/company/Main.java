package com.company;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> synonyms = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();
            synonyms.putIfAbsent(word, new ArrayList<>());
            synonyms.get(word).add(synonym);
        }

        synonyms.forEach(Main::printSynonyms);
    }

    static void printSynonyms(String word, List<String> synonymsByWord) {
        System.out.print(word + " - ");
        System.out.println(String.join(", ", synonymsByWord));
    }
}

