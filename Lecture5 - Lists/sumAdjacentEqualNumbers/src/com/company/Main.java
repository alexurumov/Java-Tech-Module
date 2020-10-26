package com.company;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(in.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i = -1;
            }
        }

        String output = joinElementsByDelimiter(numbers, " ");
        System.out.println(output);

    }

    private static String joinElementsByDelimiter(List<Double> numbers, String s) {
        String output = "";
        for (Double num : numbers) {
            output += (new DecimalFormat("0.#").format(num) + s);
        }
        return output;
    }
}
