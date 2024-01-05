import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String str  = "Tushar";
        System.out.println(str);
        
        Scanner scanner = new Scanner(System.in);
        // 1 equals method
        String temp = "TUshar";
        boolean res1 = str.equals(temp);
        boolean res2 = str.equalsIgnoreCase(temp);
        System.out.println(res1);
        System.out.println(res2);  // stores the result by ignoring cases just the characters are matched

        
        // 2 LENGTH

        int strlen =  str.length();
        System.out.println("The lenght of string " + str + " is: " + strlen);

        // 3 indexOf() return the first index of the characetr which is passed to the function
        String ch;
        System.out.print("\n\nEnter a character/String to search for:");
        ch = scanner.next();
        int idx = str.indexOf(ch);
        System.out.println("Found " + ch + " at: " + idx);

        // 4 charAt()
        System.out.print("\n\nEnter an index to get the character at that index:");
        int id = scanner.nextInt();
        System.out.println("Character at index " + id + " is: " + str.charAt(id));

        // 5 toUpperCase()
        String upper = str.toUpperCase();
        System.out.println("\n\nUpper Cased " + str + " is: " + upper);

        // 6 toLowerCase()
        String lower = str.toLowerCase();
        System.out.println("Lower Cased " + str + " is: " + lower);

        // 7 trim()
        String newstr = "   " + str + "   ";
        System.out.println("\n\nReassigned " + str + " to " + "\'" + newstr + "\'" );
        newstr = newstr.trim();
        System.out.println("Trimmed str is: " + "\'" + newstr + "\'");
        

    }
}
