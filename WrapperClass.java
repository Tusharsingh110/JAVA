/**
 * This class demonstrates the use of Wrapper Classes in Java.
 * Wrapper Classes are used to represent primitive data types as reference data types.
 * Reference data types, like Wrapper Classes, contain useful methods and can be used in collections.
 * 
 * Primitive       Wrapper
 * -----------     ---------
 * char            Character
 * int             Integer
 * boolean         Boolean
 * double          Double
 * 
 * AUTOBOXING: It's the automatic conversion done by the Java compiler between primitive data types and their corresponding objects.
 * Autoboxing allows you to use primitive data types as if they were objects, making it convenient to work with collections and other APIs that require objects.
 * 
 * UNBOXING: It's the process of converting an object of a Wrapper Class to its corresponding primitive data type.
 * Unboxing is the reverse operation of autoboxing.
 */

public class WrapperClass {

    public static void main(String args[]) {
        // Autoboxing examples
        Integer i = 3;      // Autoboxing int to Integer
        Boolean b = true;   // Autoboxing boolean to Boolean
        Double d = 0.14;    // Autoboxing double to Double
        String s = "yoink";
        Character c = '$';

        // Unboxing example
        int intValue = i;   // Unboxing Integer to int
    }
}
