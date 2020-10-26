package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String line = in.nextLine();

            String[] cmd = line.split(" ");
            switch (cmd.length) {
                case 3:
                    if (names.contains(cmd[0])) {
                        System.out.println(cmd[0] + " is already in the list!");
                    } else {
                        names.add(cmd[0]);
                    }
                    break;
                case 4:
                    if (names.contains(cmd[0])) {
                        names.remove(cmd[0]);
                    } else {
                        System.out.println(cmd[0] + " is not in the list!");
                    }
                    break;
                default:
                    break;
            }

        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    }
}
