package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String result = "";
        int strength = 0;

        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
            switch (symbol) {
                case '>':
                    result += symbol;
                    i++;
                    strength--;
                    symbol = line.charAt(i);
                    strength += Character.getNumericValue(symbol);
                    while (strength > 0) {
                        i++;
                        symbol = line.charAt(i);
                        if (symbol == '>'){
                            result += symbol;
                            i++;
                            symbol = line.charAt(i);
                            strength += Character.getNumericValue(symbol);
                            strength--;
                        } else {
                          strength--;
                        }
                    }
                    break;
                default:
                    result += symbol;
                    break;
            }
        }
        System.out.println(result);
    }
}
