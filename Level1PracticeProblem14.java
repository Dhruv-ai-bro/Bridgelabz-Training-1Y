import java.util.Scanner;

public class Level1PracticeProblem14 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        System.out.print("Enter a positive integer ");
        int n = c.nextInt();


        if (n <= 0) {
            System.out.println("Please enter a positive integer");
        } else {

            int factorial = 1;
            int i = 1;

            while (i <= n) {
                factorial = factorial * i;
                i++;
            }

            System.out.println("Factorial of " + n + " is " + factorial);
        }
    }
}
