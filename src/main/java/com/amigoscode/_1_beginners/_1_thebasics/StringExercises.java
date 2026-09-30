package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Strings
 *
 * Learn how to work with Strings in Java.
 * Strings are objects that represent sequences of characters and come with
 * many useful built-in methods.
 */
public class StringExercises {

    public static void main(String[] args) {

        String message = "Hello, Welcome to Amigoscode!";
        String padded = "   Hello World   ";
        String csv = "apple,banana,cherry,date,elderberry";

        // Get the length of the 'message' string and print it
        // Hint: Use the .length() method
        System.out.println("length of message: " + message.length());


        // Convert 'message' to uppercase and lowercase, and print both
        // Hint: Use .toUpperCase() and .toLowerCase()
        System.out.println("message in upper case: " + message.toUpperCase());
        System.out.println("message in lower case: " + message.toLowerCase());


        // Get a substring of 'message' containing the first 5 characters and print it
        // Hint: Use .substring(startIndex, endIndex)
        System.out.println("only the first 5 characters: " +message.substring(0,5));


        // Check if 'message' contains the word "Amigoscode" and print the result
        // Hint: Use .contains()
        System.out.println("checking if Amigoscode is present in message? " +message.contains("Amigoscode"));


        // Replace "Amigoscode" with "Java" in 'message' and print the new string
        // Hint: Use .replace(oldValue, newValue)
        System.out.println(
                "replacing Amigoscode in message: " + message.replace(
                    "Amigoscode",
                    "Java"
                    )
        );


        // Trim the whitespace from the 'padded' string and print the result
        // Hint: Use .trim()
        System.out.println("triming the word padded: " + padded.trim());


        // Split the 'csv' string by commas into a String array and print each element
        // Hint: Use .split(",") then loop through the resulting array
        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Check if two strings are equal using .equals() (not ==)
        // Create two String variables with the same text content and compare them.
        // Print the result of .equals() and explain why == may not work for Strings.
        String a = new String("hello");
        String b = new String("hello");
        System.out.println("checking if a vs b are equal: " + a.equals(b) );
        System.out.println("checking if a == b are equal: " + (a==b) );
        // == checks if both variables point to the same object in memory and .equals checks the content.
        // while .equals() checks if the content is the same.
        // That's why == may return false for two Strings with the same text.

    }
}
