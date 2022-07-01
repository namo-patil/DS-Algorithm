package com.bridgelabz;

import java.util.Scanner;

public class PermutationsOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("1. Enter to Find All Permutations.");
            System.out.println("2. Exit");
            int ch = scanner.nextInt();
            System.out.println("-------------------------------------------");
            switch (ch) {
                case 1:
                    System.out.println("Enter String Which you want to find Permutation.");
                    String givenString = scanner.next();
                    PermutationsOfString permutations = new PermutationsOfString();
                    System.out.println("All Permutations : ");
                    permutations.printPermutations(givenString, "");
                    break;
                case 2:
                    System.out.println("You Exit From Permutation Program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input!!!");
                    break;
            }
        }
    }

    public void printPermutations(String givenString, String result) {
        if (givenString.length() == 0) {
            System.out.println(result);
        }

        for (int index = 0; index < givenString.length(); index++) {
            char ch = givenString.charAt(index);
            String stringLeftPart = givenString.substring(0, index);
            String stringRightPart = givenString.substring(index + 1);

            String restOfString = stringLeftPart + stringRightPart;

            printPermutations(restOfString, result + ch);
        }
    }
}