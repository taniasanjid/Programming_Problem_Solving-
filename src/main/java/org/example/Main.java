package org.example;
import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String word) {
        String reversedString = new StringBuilder(word).reverse().toString();
        return word.equals(reversedString);
    }
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter input :");
        String input = myObj.nextLine();
        input = input.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
        myObj.close();
    }
}