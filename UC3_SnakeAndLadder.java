package com.company;


public class UC3_SnakeAndLadder {

    {
        // welcome to snake ladder program.

        int currentPlayerPosition = 0;
        int position = 0;

        System.out.println("Welcome to snake ladder game");
        System.out.println("Player will start from zero position.");

        int dieRolling = (int) Math.floor(Math.random() * 10) % 7;
        if (dieRolling == 0) {
            dieRolling = dieRolling + 1;
        }
        System.out.println("Number on die is: " + dieRolling);
        position = currentPlayerPosition + dieRolling;

        int checkOptions = (int) Math.floor(Math.random() * 10) % 3;
        switch (checkOptions) {

            case 0: {
                System.out.println("There will be no play. Player will be at same position");
            }
            //   System.out.println("Player is at: " + currentPlayerPosition);
            break;

            case 1: {
                System.out.println("Player will move forward");
                if (currentPlayerPosition < 100) {
                    currentPlayerPosition = position;
                }
            }
            System.out.println("Player is at: " + currentPlayerPosition);
            break;

            case 2: {
                System.out.println("Player is bitten by a snake");
                if (currentPlayerPosition > 0) {
                    currentPlayerPosition = position - dieRolling;

                } else if (currentPlayerPosition <= 0) {
                    currentPlayerPosition = START_POSITION;
                }
            }
            System.out.println("Player is at: " + currentPlayerPosition);
            break;

        }
    }
}

