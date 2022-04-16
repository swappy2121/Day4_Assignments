package com.company;

public class UC4_Winning_Position {

    static final int START_POSITION = 0;
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        // welcome to snake ladder program.

        int currentPlayerPosition = 0;
        int position = 0;
        int dieCount = 0;
        System.out.println("Welcome to snake ladder game");
        System.out.println("Player will start from zero position.");


        //   position = currentPlayerPosition + dieRolling;

        while (currentPlayerPosition < WINNING_POSITION) {
            dieCount++;

            int dieRolling = (int) Math.floor(Math.random() * 10) % 7;
            if (dieRolling == 0) {
                dieRolling = dieRolling + 1;
            }
            System.out.println("Number on die is: " + dieRolling);


            int checkOptions = (int) Math.floor(Math.random() * 10) % 3;
            switch (checkOptions) {

                case 0: {
                    System.out.println("There will be no play. Player will be at same position");
                }
                //   System.out.println("Player is at: " + currentPlayerPosition);
                break;

                case 1: {
                    System.out.println("Player will move forward");
                    position = currentPlayerPosition;
                    if (currentPlayerPosition < 100) {
                        currentPlayerPosition = currentPlayerPosition + dieRolling;

                        if (currentPlayerPosition >= WINNING_POSITION) {
                            currentPlayerPosition = position;
                        }
                    }
                }
                //    System.out.println("Player is at: " + currentPlayerPosition);
                break;

                case 2: {
                    System.out.println("Player is bitten by a snake");
                    if (currentPlayerPosition > 0) {
                        currentPlayerPosition = currentPlayerPosition - dieRolling;

                    } else if (currentPlayerPosition <= 0) {
                        currentPlayerPosition = START_POSITION;
                    }
                }
                //     System.out.println("Player is at: " + currentPlayerPosition);
                break;

            }
            System.out.println("Position after each die rolled: " + currentPlayerPosition);
        }
        System.out.println("Numbr of times die rolled: " + dieCount);
    }
}
