package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Integer> nums = Arrays
                .stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int size = nums.size();

        for (int i = 0; i < size / 2; i++) {
            nums.set(i, nums.get(i) + nums.get(nums.size() - 1));
            nums.remove(nums.size() - 1);
        }

        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));

    }
}
