package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String numbersString = in.nextLine();
        String regex = "(^|(?<=\\s))-?\\d+(\\.\\d+)?($|(?=\\s))";
        Pattern pattern = Pattern.compile(regex);
        Matcher numbers = pattern.matcher(numbersString);

        while (numbers.find()) {
            System.out.print(numbers.group() + " ");
        }

    }
}
