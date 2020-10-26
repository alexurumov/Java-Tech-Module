package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        int lastSlash = path.lastIndexOf("\\");
        path = path.substring(lastSlash + 1);
        int dot = path.lastIndexOf(".");
        System.out.println("File name: " + path.substring(0, dot));
        System.out.println("File extension: " + path.substring(dot + 1));
    }
}
