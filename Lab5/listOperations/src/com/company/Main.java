package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String line = in.nextLine();

        while (!line.equals("End")) {
            String[] cmd = line.split(" ");

            switch (cmd[0]) {
                case "Add":
                    nums.add(Integer.parseInt(cmd[1]));
                    break;
                case "Insert":
                    int indexIns = Integer.parseInt(cmd[2]);
                    if (indexIns >= 0 && indexIns < nums.size()) {
                        nums.add(indexIns, Integer.parseInt(cmd[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int index = Integer.parseInt(cmd[1]);
                    if (index >= 0 && index < nums.size()) {
                        nums.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int times = Integer.parseInt(cmd[2]);
                    times = times % nums.size();
                    if (cmd[1].equals("left")) {
                        for (int i = 0; i < times; i++) {
                            nums.add(nums.get(0));
                            nums.remove(0);
                            }
                        } else {
                        for (int i = 0; i < times; i++) {
                            nums.add(0, nums.get(nums.size() - 1));
                            nums.remove(nums.size() - 1);
                        }
                    }
                    break;
                default:
                    break;
            }

            line = in.nextLine();
            if (line.equals("End")){
                break;
            }
        }

        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));

    }
}
