package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String phonesString = in.nextLine();
        String regex = "\\+359([\\- ])2\\1\\d{3}\\1\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher phones = pattern.matcher(phonesString);
        List<String> phonesList = new LinkedList<>();
        while (phones.find()) {
            phonesList.add(phones.group());
        }
        System.out.println(phonesList.toString().replaceAll("[\\[\\]]", ""));
    }
}
