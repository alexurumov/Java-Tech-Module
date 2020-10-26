package com.company;

import java.util.Scanner;

public class Main {

    public static int calcRectangleArea(int height, int width) {

        return height * width;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int height = Integer.parseInt(in.nextLine());
        int width = Integer.parseInt(in.nextLine());
        int area = calcRectangleArea(height, width);
        System.out.println(area);

    }
}
