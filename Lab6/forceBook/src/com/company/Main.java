package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, List<String>> usersBySide = new HashMap<>();
        String line = in.nextLine();

        while (!line.equals("Lumpawaroo")) {
            if (line.contains(" | ")) {
                String[] tokens = line.split(" \\| ");
                String user = tokens[1];
                String side = tokens[0];
                usersBySide.putIfAbsent(side, new ArrayList<>());
                boolean exists = false;
                for (Map.Entry<String, List<String>> entry : usersBySide.entrySet()) {
                    List<String> users = entry.getValue();
                    if (users.contains(user)) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    usersBySide.get(side).add(user);
                }
            } else if (line.contains(" -> ")) {
                String[] tokens = line.split(" -> ");
                String user = tokens[0];
                String side = tokens[1];

                usersBySide.putIfAbsent(side, new ArrayList<>());

                boolean exists = false;
                for (Map.Entry<String, List<String>> entry : usersBySide.entrySet()) {
                    List<String> users = entry.getValue();
                    if (users.contains(user)) {
                        users.remove(user);
                        exists = true;
                        break;
                    }
                }

                usersBySide.get(side).add(user);
                System.out.println(user + " joins the " + side + " side!" );
//                if (!exists) {
//                    System.out.println(user + " joins the " + side + " side!" );
//                }
            }

            line = in.nextLine();
        }

        usersBySide.entrySet().stream().sorted((es1, es2) -> {
            int count2 = es2.getValue().size();
            int count1 = es1.getValue().size();
            if (count1 == count2) {
                return es1.getKey().compareTo(es2.getKey());
            }

            return Integer.compare(count2, count1);
        }).forEach( es -> {
            if (es.getValue().size() == 0) {
                return;
            } else {
                System.out.printf("Side: %s, Members: %d%n", es.getKey(), es.getValue().size());
                Collections.sort(es.getValue());
                es.getValue().forEach(u -> System.out.println("! " + u));
            }
        });
    }
}

