package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = in.nextLine();

        while (!line.equals("end")) {

            String[] cmd = line.split("\\s+");

            switch (cmd[0]) {
                case "Delete":
                    int delEl = Integer.parseInt(cmd[1]);
                    while (numbers.contains(delEl)) {
                        numbers.remove(Integer.valueOf(delEl));
                    }
                    break;
                case "Insert":
                    int insEl = Integer.parseInt(cmd[1]);
                    int index = Integer.parseInt(cmd[2]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.add(index, insEl);
                    } else {
                        break;
                    }
                default:
                    break;
            }

            line = in.nextLine();

            if (line.equals("end")) {
                break;
            }
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
