package edu.guilford;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of sides for the dice:");
        int sides = scan.nextInt();

        System.out.println("Enter the number of dice to roll:");
        int number = scan.nextInt();

        int sum = 0;

        for (int i = 0; i < number; i++) {
            int diceRoll = rand.nextInt(sides) + 1;
            sum += diceRoll;
            // System.out.println("Sum of " + (i + 1) + "d" + sides + " = " + sum);
        }

        System.out.println(number + "d" + sides + " = " + sum);
    }
}
