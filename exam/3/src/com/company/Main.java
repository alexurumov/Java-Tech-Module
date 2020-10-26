package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        List<String> journal = Arrays.stream(line.split(", ")).collect(Collectors.toList());

        line = in.nextLine();

        while (!line.equals("Retire!")) {
            String[] cmd = line.split(" - ");
            String command = cmd[0].toLowerCase();
            String quest = cmd[1];

            switch (command) {
                case "start":
                    if (!journal.contains(quest)) {
                        journal.add(quest);
                    }
                    break;
                case "complete":
                    if (journal.contains(quest)) {
                        journal.remove(quest);
                    }
                    break;
                case "side quest":
                    String [] sideQuest = quest.split(":");
                    quest = sideQuest[0];
                    String side = sideQuest[1];
                    if (journal.contains(quest)) {
                        int index = journal.indexOf(quest) + 1;
                        if (!journal.contains(side)) {
                            journal.add(index, side);
                        }
                    }
                    break;
                case "renew":
                    if (journal.contains(quest)) {
                        journal.remove(quest);
                        journal.add(quest);
                    }
                    break;
                default:
                    break;
            }

            line = in.nextLine();
            if (line.equals("Retire!")) {
                break;
            }
        }
        System.out.println(journal.toString().replaceAll("[\\[\\]]", ""));

    }
}
