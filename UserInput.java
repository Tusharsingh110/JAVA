
/*
 * Taking User Input
 */
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the number a: ");
        a=scanner.nextInt();
        System.out.print("Enter the number b: ");
        b=scanner.nextInt();
        int sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is " + sum );
    }
}
