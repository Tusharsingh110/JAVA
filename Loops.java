/**
 * Loops
 */
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // FOR LOOP
        System.out.println("Printing 1 - 10 using FOR LOOP");
        for(int i=0;i<=10;i++) {
            System.out.print(i + " ");
        }

        System.out.println("Taking user input using WHILE LOOP");
        String name="";
        // WHILE LOOP
        while(name.isBlank()) {
            System.out.print("\nEnter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("So, your name is " + name);

        System.out.println("LOOPING UNTIL user wants using DO-WHILE LOOP");
        char more = 'N';
        do {
            System.out.print("Enter an integer x: ");
            int x = scanner.nextInt();
            System.out.print("Enter an integer y: ");
            int y = scanner.nextInt();
            int sum = x+y;
            System.out.println("Sum of " + x + " and " + y + " is: " + sum);
            System.out.print("Wanna do it once more?? If yes then press(Y/y), any key otherwise:");
            more = scanner.next().charAt(0);
            // System.out.println(more);
        }while(more=='Y' || more == 'y');
    }
}