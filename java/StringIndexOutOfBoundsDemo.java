import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text) {

        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }


    public static void handleException(String text) {
        try {

            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Invalid index! String index is out of bounds.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String text = sc.next();


        System.out.println("Calling method to generate exception:");
        generateException(text);


        System.out.println("\nCalling method to handle exception:");
        handleException(text);


    }
}
