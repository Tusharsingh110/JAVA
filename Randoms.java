import java.util.Random;    
public class Randoms {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(6)+1;
        System.out.println("A randomly generated integer:" + a);

        double d = random.nextDouble();
        System.out.println("A randomly generated double value:" + d);
    }
}
