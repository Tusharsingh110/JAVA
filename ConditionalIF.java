/**
 * ConditionalIF
 */
public class ConditionalIF {

    public static void main(String[] args) {
        int age = 6;

        if(age < 18) {
            System.out.println("You\'re a child!!");
        }else if(age>=18 && age<50) {
            System.out.println("You\'re working Individual!!");
        }else {
            System.out.println("You\'re Retired, Go HOME!!");
        }
    }
}