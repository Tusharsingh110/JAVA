/*
 * Arrays 
 */

import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // integer array arr of size n
        int n ;
        System.out.print("Enter the length of the array you want:");
        n = scanner.nextInt();
        System.out.println("Generating an empty Array of Integers of size " + n);
        System.out.println("Enter " + n + " elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Printing the array . . .");
        for (int e : arr) {
            System.out.println(e);
        }

        //Similarly we can create arrays of different datatypes for both primitive and reference

        String[] cars = new String[3];
        cars[0] = "Rolls Royce";
        cars[1] = "Land Rover";
        cars[2] = "Bugatti Cheron";

        for (String car : cars) {
            System.out.println(car);
        }
    }
}