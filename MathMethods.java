import java.util.Scanner;
public class MathMethods {
    public static void main(String[] args) {
        int a = 3;
        double d = 3.14;
        
        Scanner scanner = new Scanner(System.in); 
        double max = Math.max(a,d);
        double min = Math.min(a,d);
        System.out.println("Maximum of them is: " + max);
        System.out.println("Minimum of them is: " + min);
        System.out.print("Enter a number to find the square root of:");
        int num = scanner.nextInt();
        System.out.println("Square root of " + num + " is: " + Math.sqrt(num));
    }
}
