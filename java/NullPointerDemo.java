
public class NullPointerDemo {
    public static void generateException() {
        String text = null;

        // This will throw NullPointerException
        System.out.println("Length of string: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;

        try {
            // This will throw exception
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Cannot call methods on a null reference.");
        }
    }

    public static void main(String[] args) {

        // Step 1: Generate Exception (program will crash here)
        System.out.println("Calling method to generate exception:");
        generateException();

        // Step 2: Handle Exception (this won't run unless above is commented)
        System.out.println("\nCalling method to handle exception:");
        handleException();
    }
}

