package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Operators
 *
 * Learn how to use arithmetic, comparison, logical, and other operators in Java.
 * Operators allow you to perform operations on variables and values.
 */
public class Operators {

    public static void main(String[] args) {

        // Use arithmetic operators (+, -, *, /) on two int variables and print the results
        // Declare two int variables (e.g., a = 10, b = 3)
        // Print the result of a + b, a - b, a * b, and a / b
        int valueA = 20;
        int valueB = 30;
        int resultMultiply = valueA * valueB;
        int resultAdd = valueA + valueB;
        int resultSubtract = valueA - valueB;
        int resultDivision = valueA / valueB;
        System.out.println("multiply: " + resultMultiply);
        System.out.println("addition: " + resultAdd);
        System.out.println("subtract: " + resultSubtract);
        System.out.println("division: " + resultDivision);


        // Use the modulus operator (%) to check if a number is even
        // Declare an int variable called number with any value.
        // Print the result of number % 2
        // Print whether the number is even (result is 0) or odd (result is 1)
        int number = 89;
        int resultModulus = number %2;
        if ( resultModulus == 0) {
            System.out.println("the number is even " + resultModulus);
        } else {
            System.out.println("the number is odd " + resultModulus);
        }


        // Use increment (++) and decrement (--) operators
        // Declare an int variable called counter, set it to 5
        // Use counter++ and print the result, then use counter-- and print the result
        int counter = 5;
        System.out.println("original count " + counter);
        counter++;
        System.out.println("counter adding " + counter);
        counter--;
        System.out.println("counter subtracting " + counter);


        // Use compound assignment operators (+=, -=, *=)
        // Declare an int variable called score, set it to 10
        // Use +=, -=, and *= on score, printing after each operation
        int score = 10;
        System.out.println("original score " + score);
        score+= 20;
        System.out.println("score += " + score);
        score-= 2;
        System.out.println("score -= " + score);
        score*= 2;
        System.out.println("score *= " + score);



        //Use comparison operators (==, !=, >, <, >=, <=) and print the boolean results
        // Declare two int variables (e.g., x = 5, y = 10)
        // Print the result of each comparison, e.g.: System.out.println("x == y: " + (x == y));
        int valueX = 5;
        int valueY = 10;
        boolean result1 = (valueX == valueY);
        System.out.println("equal variables? " +result1 );
        boolean result2 = (valueX != valueY);
        System.out.println("not equal variables? " + result2);
        boolean result3 = (valueX > valueY);
        System.out.println("X is greater than y? " + result3);
        boolean result4 = (valueX < valueY);
        System.out.println("X is less than y? " + result4);
        boolean result5 = (valueX <= valueY);
        System.out.println("X is less than equal y? " + result5);
        boolean result6 = (valueX >= valueY);
        System.out.println("X is less than equal y? " + result6);




        //Use logical operators (&&, ||, !) to combine conditions
        // Declare two boolean variables (e.g., hasLicense = true, hasInsurance = false)
        // Print the result of: hasLicense && hasInsurance
        // Print the result of: hasLicense || hasInsurance
        // Print the result of: !hasLicense
        boolean hasLicense = true;
        boolean hasInsurance = false;
        boolean hasEverything = (hasLicense && hasInsurance);
        System.out.println("he has everything? " + hasEverything);
        boolean hasEverything2 = (hasLicense || hasInsurance);
        System.out.println("he has everything2? " + hasEverything2);
        boolean doesntHasLicense = (!hasLicense);
        System.out.println("he hasn't License? " + doesntHasLicense);


        // Use the ternary operator to assign "adult" or "minor" based on age
        // Declare an int variable called age with any value
        // Use the ternary operator: String status = (condition) ? "adult" : "minor";
        // Print the status
        int age = 55;
        String status = (age > 55) ? "adult who can not participate" : "adult that can participate";
        System.out.println(status);

    }
}
