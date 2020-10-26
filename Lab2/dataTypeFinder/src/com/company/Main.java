package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {



            if (in.hasNextInt()) {

                int input = Integer.parseInt(in.nextLine());
                System.out.println(input + " is integer type");

            } else if (in.hasNextFloat()) {

                Float input = Float.parseFloat(in.nextLine());
                System.out.println(input + " is floating point type");

            } else if (in.hasNextDouble()) {

                Double input = Double.parseDouble(in.nextLine());
                System.out.println(input + " is double type");

            } else if (in.hasNextBoolean()) {

                Boolean input = Boolean.parseBoolean(in.nextLine());
                System.out.println(input + " is boolean type");

            } else if (in.hasNextLong()) {

                Long input = Long.parseLong(in.nextLine());
                System.out.println(input + " is long type");

            } else if (in.hasNextByte()) {

                Byte input = Byte.parseByte(in.nextLine());
                System.out.println(input + " is byte type");

            } else if (in.hasNextBigDecimal()) {

                BigDecimal input = new BigDecimal(in.nextLine());
                System.out.println(input + " is big decimal type");

            } else if (in.hasNextBigInteger()) {

                BigInteger input = new BigInteger(in.nextLine());
                System.out.println(input + " is big integer type");

            } else if (in.hasNextLine()) {

                String input = in.nextLine();

                if (input.equals("END")) {

                    break;

                } else if (input.length() == 1){

                    System.out.println(input + " is character type");

                } else {

                    System.out.println(input + " is string type");

                }

            }

        }

    }
}
