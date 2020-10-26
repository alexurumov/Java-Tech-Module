package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Map<String, Integer> videosWithViews = new HashMap<>();
        Map<String, Integer> videosWithLikes = new HashMap<>();

        String input = in.nextLine();

        while (!input.equals("stats time")) {

            if (input.contains("-")) {
                String[] tokens = input.split("-");
                String video = tokens[0];
                int views = Integer.parseInt(tokens[1]);

                if (!videosWithViews.containsKey(video)) {
                    videosWithViews.put(video, views);
                    videosWithLikes.put(video, 0);
                } else {
                    videosWithViews.put(video, videosWithViews.get(video) + views);
                }
            } else {
                String[] tokens = input.split(":");
                String video = tokens[1];
                if (tokens[0].equals("like")) {
                    if (videosWithLikes.containsKey(video)) {
                        videosWithLikes.put(video, videosWithLikes.get(video) + 1);
                    }
                } else {
                    if (videosWithLikes.containsKey(video)) {
                        videosWithLikes.put(video, videosWithLikes.get(video) - 1);
                    }
                }

            }

            input = in.nextLine();
        }

        String sortCriteria = in.nextLine();
        if (sortCriteria.equals("by views")) {
            videosWithViews.entrySet().stream().sorted((v1, v2) -> v2.getValue().compareTo(v1.getValue())).forEach(es -> {
                System.out.printf("%s - %d views - %d likes %n", es.getKey(), es.getValue(), videosWithLikes.get(es.getKey()));
            });
        } else {
            videosWithLikes.entrySet().stream().sorted((v1, v2) -> v2.getValue().compareTo(v1.getValue())).forEach(es -> {
                System.out.printf("%s - %d views - %d likes %n", es.getKey(), videosWithViews.get(es.getKey()), es.getValue());
            });
        }

    }
}
