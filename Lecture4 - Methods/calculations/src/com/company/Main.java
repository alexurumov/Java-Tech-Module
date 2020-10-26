package com.company;

import java.util.Scanner;

public class Main {

    public static void add(int first, int second) {
        int sum = first + second;
        System.out.println(sum);;
    }

    public static void subtract(int first, int second) {
        int subtract = first - second;
        System.out.println(subtract);
    }

    public static void multiply(int first, int second) {
        int multiply = first * second;
        System.out.println(multiply);
    }

    public static void divide(int first, int second) {
        int divide = first / second;
        System.out.println(divide);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String function = in.nextLine();
        int first = Integer.parseInt(in.nextLine());
        int second = Integer.parseInt(in.nextLine());

        switch (function){
            case "add": add(first, second); break;
            case "subtract": subtract(first, second); break;
            case "multiply": multiply(first, second); break;
            case "divide": divide(first, second); break;
        }

    }
}
