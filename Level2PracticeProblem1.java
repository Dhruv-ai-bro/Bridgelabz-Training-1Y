import java.util.Scanner;


public class Level2PracticeProblem1 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = c.nextInt();

        if (number <= 0) {
            System.out.println(" enter a valid natural number");
        } else {
            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is even number");
                } else {
                    System.out.println(i + " is odd number");
                }
            }
        }
    }
}
