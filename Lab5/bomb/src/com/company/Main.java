package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] cmd = in.nextLine().split(" ");

        int bomb = Integer.parseInt(cmd[0]);
        int range = Integer.parseInt(cmd[1]);

        while (numbers.contains(bomb)) {
            int index = numbers.indexOf(bomb);

            int begin = Math.max(0, index - range);

            for (int i = begin; i < index; i++) {
                numbers.remove(begin);
            }

            index = numbers.indexOf(bomb);

            int end = Math.min(numbers.size() - 1, index + range);

            for (int i = index; i <= end; i++) {
                numbers.remove(index);
            }
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum+= number;
        }
        System.out.println(sum);
//        numbers.stream().reduce((e1, e2) -> e1 + e2).ifPresent(e -> System.out.print(e));

    }
}
