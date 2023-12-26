/*
 *  JAVA GUI Implementation (JOptionPane)
 */
import javax.swing.JOptionPane;
public class Gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age."));

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height."));

        JOptionPane.showMessageDialog(null,"Hello " + name + "!!.\nYou are " + age + " now!! That\'s awesome!!\nYou look like you are " + height + " cms tall!!");
        
    }
}
