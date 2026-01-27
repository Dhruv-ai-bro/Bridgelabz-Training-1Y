import java.util.Scanner;

public class Level1PracticeProblem15 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = c.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {

            int factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + n + " is " + factorial);
        }
    }
}
