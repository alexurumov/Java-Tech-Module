package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        String[] parts = line.split("\\|");

        List<String> numsStr = new ArrayList<>();

        List<Integer> nums = new ArrayList<>();

        for (int i = parts.length - 1; i >= 0; i--) {
            String numLine = parts[i].toString();
            numsStr = Arrays.stream(numLine.split("\\s+")).collect(Collectors.toList());

            for (int j = 0; j < numsStr.size(); j++) {
                if (numsStr.get(j).equals("")){
                    continue;
                } else {
                    nums.add(Integer.parseInt(numsStr.get(j)));
                }
            }

            }

        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
        }


    }
