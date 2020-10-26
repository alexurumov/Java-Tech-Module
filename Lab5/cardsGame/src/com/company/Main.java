package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        List<Integer> playerOne = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (!playerOne.isEmpty() && !playerTwo.isEmpty()) {
            int playerOneCard = playerOne.get(0);
            int playerTwoCard = playerTwo.get(0);

            if (playerOneCard > playerTwoCard) {
                playerOne.remove(0);
                playerTwo.remove(0);
                playerOne.add(playerOneCard);
                playerOne.add(playerTwoCard);
            } else if (playerOneCard < playerTwoCard) {
                playerOne.remove(0);
                playerTwo.remove(0);
                playerTwo.add(playerTwoCard);
                playerTwo.add(playerOneCard);
            } else {
                playerOne.remove(0);
                playerTwo.remove(0);
            }

        }

        if (playerOne.isEmpty()) {
            System.out.print("Second player wins! Sum: ");
            playerTwo.stream().reduce((e1, e2) -> e1 + e2).ifPresent(e -> System.out.println(e));
        } else {
            System.out.print("First player wins! Sum: ");
            playerOne.stream().reduce((e1, e2) -> e1 + e2).ifPresent(e -> System.out.println(e));
        }
    }
}
