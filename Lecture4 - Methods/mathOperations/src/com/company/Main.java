package com.company;

import java.util.Scanner;

public class Main {

    static int calculate(int a, String operation, int b) {
        int result = 0;
        switch (operation) {
            case "+": result = a + b;
                break;
            case "-": result = a - b;
                break;
            case "*": result = a * b;
                break;
            case "/": result = a / b;
                break;
                default:
                    break;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int firstNum = Integer.parseInt(in.nextLine());
        String operation = in.nextLine();
        int secundNum = Integer.parseInt(in.nextLine());

        System.out.println(calculate(firstNum, operation, secundNum));

    }
}
