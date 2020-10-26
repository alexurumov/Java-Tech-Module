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

            String[] cmd = line.split(" ");

            switch (cmd[0]) {
                case "Add":
                    int number1 = Integer.parseInt(cmd[1]);
                    numbers.add(number1);
                    break;
                case "Remove":
                    int number2 = Integer.parseInt(cmd[1]);
                    numbers.remove(number2);
                    break;
                case "RemoveAt":
                    int indexR = Integer.parseInt(cmd[1]);
                    numbers.remove(indexR);
                    break;
                case "Insert":
                    int number = Integer.parseInt(cmd[1]);
                    int index = Integer.parseInt(cmd[2]);
                    numbers.add(index, number);
                    break;
                default:
                    break;

            }

            line = in.nextLine();
            if (line.equals("end")){
                break;
            }
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
