package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Song {
        String typeList;
        String name;
        String time;

        public void setName(String name) {
            this.name = name;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }
        public String getName() {
            return name;
        }
        public String getTime() {
            return time;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().split("_");
            String type = input[0];
            String name = input[1];
            String time = input[2];

            Song song = new Song();

            song.setName(name);
            song.setTypeList(type);
            song.setTime(time);

            songs.add(song);
        }

        String typeList = in.nextLine();
        if (typeList.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }
            }
        }

    }
}




