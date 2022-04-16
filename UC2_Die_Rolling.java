package com.company;


public class UC2_Die_Rolling {

    static final int START_POSITION = 0;

    public static void main(String[] args) {
        // welcome to snake ladder program.
        System.out.println("Welcome to snake ladder game");
        System.out.println("Player will start from zero position.");

        int dieRolling = (int) Math.floor(Math.random() * 10) % 7;
        if (dieRolling == 0) {
            dieRolling = dieRolling + 1;

        }
        System.out.println("Number on die is: " + dieRolling);
    }
}
