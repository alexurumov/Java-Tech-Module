package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Integer> wagons = Arrays
                .stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(in.nextLine());

        String line = in.nextLine();

        while (!line.equals("end")) {

            String[] tokens = line.split(" ");

            if (tokens[0].equals("Add")) {
                int newWagon = Integer.parseInt(tokens[1]);
                wagons.add(newWagon);
            } else {
                int passengers = Integer.parseInt(tokens[0]);

                // ново условие -> да разпределим пътниците по вагоните, колкото можем във всеки

                for (int i = 0; i < wagons.size(); i++) {
                    int wagon = wagons.get(i);
                    if (maxCapacity - wagon >= passengers) {
                        wagons.set(i, wagon + passengers);
                        break;
                    } else {
                        wagons.set(i, maxCapacity);
                        passengers -= maxCapacity - wagon;
                    }
                }
//                wagons.stream().filter(w -> maxCapacity - w >= passengers)
//                        .findFirst()
//                        .ifPresent(freeWagon -> {
//                            int indexOfFreeWagon = wagons.indexOf(freeWagon);
//                            wagons.set(indexOfFreeWagon, freeWagon + passengers);
//                        });

            }

            line = in.nextLine();

        }

        wagons.forEach(w -> System.out.print(w + " "));

    }
}
