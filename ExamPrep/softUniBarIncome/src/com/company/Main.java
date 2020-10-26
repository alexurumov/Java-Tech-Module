package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        double total = 0;

        while (!input.equals("end of shift")) {
            String regex = "\\%([A-Z][a-z]+)\\%[^$^\\.^\\%^\\|]*?<(\\w+)>[^$^\\.^\\%^\\|]*?\\|(\\d+)\\|[^$^\\.^\\%^\\|]*?(\\d+\\.?\\d+)\\$";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {

                double sum = Integer.parseInt(matcher.group(3)) * Double.parseDouble(matcher.group(4));

                total += sum;

                System.out.printf("%s: %s - %.2f%n", matcher.group(1), matcher.group(2), sum);
            }
            input = in.nextLine();
        }
        System.out.printf("Total income: %.2f%n", total);
     }

}
