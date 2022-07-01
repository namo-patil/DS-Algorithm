package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("First String: ");
        String first = scan.nextLine();

        System.out.print("Second String: ");
        String second = scan.nextLine();

        AnagramDetection anagramDetection = new AnagramDetection();
        anagramDetection.anagram(first, second);
    }

    public void anagram(String first, String second) {
        first = first.toLowerCase();
        second = second.toLowerCase();

        if (first.length() == second.length()) {
            char[] charArray1 = first.toCharArray();
            char[] charArray2 = second.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(first + " And " + second + " Are Anagram");
            } else {
                System.out.println(first + " And " + second + " Are Not Anagram");
            }
        } else {
            System.out.println(first + " And " + second + " Are Not Anagram");
        }
    }
}