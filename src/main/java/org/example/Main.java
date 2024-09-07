package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**taking input*/

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter word :");
        String word = myObj.nextLine();

        /**reversing string*/

        StringBuilder reversedString = new StringBuilder();
        reversedString.append(word);
        reversedString.reverse();
/**output*/

        System.out.println("Reversed word : \n" + reversedString.toString());
        myObj.close();
    }
}
