import java.util.Scanner;


public class Level2PracticeProblem10 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);


        System.out.print("Enter a positive integer: ");
        int number = c.nextInt();


        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {

            int greatestFactor = 1;
            int counter = number - 1;

            // Loop till counter is >= 1
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }

            System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
        }
    }
}
