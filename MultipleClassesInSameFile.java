/*
 * Multiple Classes
 */
public class MultipleClassesInSameFile {
    public static void main(String[] args) {
 
        System.out.print(GenerateMessage.generateMessage());
        System.out.print(AnotherMessage.generateAnotherMessage());
    }
}
 
class GenerateMessage {
    static String generateMessage() {
        return "Here is one message";
    }
}
 
class AnotherMessage {
    static String generateAnotherMessage() {
        return "Here is another message";
    }
}
