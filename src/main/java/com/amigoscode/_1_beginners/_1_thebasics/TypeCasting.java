package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class TypeCasting {

    public static void main(String[] args) {

        //  1 - Widen an int to a double (implicit casting)
        int precio = 9;
        double exactPrice = precio;
        System.out.println(precio);
        System.out.println(exactPrice);
        // Declare an int variable with any value, then assign it to a double variable.
        // Print both variables to see the result.


        //  Narrow a double to an int (explicit casting)
        // Declare a double variable (e.g., 9.78), then cast it to an int.
        // Print both variables to see what happens to the decimal part.
        double priceExact2 = 200.78;
        int shortPrice = (int) priceExact2;
        System.out.println(priceExact2);
        System.out.println(shortPrice);


        // Cast an int to a char to get the character it represents
        // Hint: int value 65 corresponds to 'A' in ASCII
        // Print the resulting char.
        int valDeA = 65;
        char letterA = (char) valDeA;
        System.out.println(valDeA);
        System.out.println(letterA);


        // Cast a char to an int to get its ASCII value
        // Hint: char 'Z' has an ASCII value of 90
        // Print the resulting int.
        char letterZ = 'Z';
        int  im90 =  letterZ;
        System.out.println(letterZ);
        System.out.println(im90);


        // Convert a String "42" to an int using Integer.parseInt()
        // Declare a String variable with the value "42", then parse it to an int.
        // Print the result.
        String soy42 = "42";
        int soy42Num = Integer.parseInt(soy42);
        System.out.println(soy42);
        System.out.println(soy42Num);


        // Convert an int 42 to a String using String.valueOf()
        // Declare an int variable with the value 42, then convert it to a String.
        // Print the result.
        int val42 = 42;
        String str42 = String.valueOf(val42);
        System.out.println(str42);

    }
}
