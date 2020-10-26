package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((e1, e2) -> e2.compareTo(e1))
                .collect(Collectors.toList());
        int count = nums.size() >= 3 ? 3 : nums.size();

        for (int i = 0; i < count; i++) {
            System.out.print(nums.get(i) + " ");
        }
    }
}
