package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Map<String, String> UsersAndCars = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            String[] input = line.split(" ");
            if (input[0].equals("register")) {
                String user = input[1];
                String plate = input[2];
                if (UsersAndCars.containsKey(user)) {
                    System.out.println("ERROR: already registered with plate number " + plate);
                } else {
                    UsersAndCars.put(user, plate);
                    System.out.println(user + " registered " + plate + " successfully");
                }
            } else if (input[0].equals("unregister")) {
                String user = input[1];
                if (!UsersAndCars.containsKey(user)) {
                    System.out.println("ERROR: user " + user + " not found");
                } else {
                    UsersAndCars.remove(user);
                    System.out.println(user + " unregistered successfully");
                }
            }
        }

        for (String user : UsersAndCars.keySet()) {
            System.out.println(user + " => " + UsersAndCars.get(user));
        }
    }
}
