package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int fieldSize = Integer.parseInt(in.nextLine());

        String[] indexes = in.nextLine().split(" ");

        int[] field = new int[fieldSize];

        for (int i = 0; i < indexes.length; i++) {
            int index = Integer.parseInt(indexes[i]);
            if (index >= 0 && index < fieldSize ) {
                field[index] = 1;
            }

        }

        String command = in.nextLine();

        while (!command.equals("end")) {

            String[] cmdArgs = command.split(" ");

            int index = Integer.parseInt(cmdArgs[0]);
            String cmd = cmdArgs[1];
            int flyLength = Integer.parseInt(cmdArgs[2]);

            if (index < 0 || index > fieldSize - 1 || field[index] == 0) {
                command = in.nextLine();
                continue;
            }

            field[index] = 0;

            if (cmd.equals("right")) {
                index += flyLength;
                while (index < fieldSize && field[index] == 1) {
                    index += flyLength;
                }
                if (index < fieldSize) {
                    field[index] = 1;
                }
            } else {
                index -= flyLength;
                while (index >= 0 && field[index] == 1) {
                    index -= flyLength;
                }
                if (index >= 0) {
                    field[index] = 1;
                }
            }



            command = in.nextLine();
        }

        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");
        }
        System.out.println();

    }
}
