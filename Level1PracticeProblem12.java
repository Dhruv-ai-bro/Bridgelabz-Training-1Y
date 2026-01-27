import java.util.Scanner;

public class Level1PracticeProblem12 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = c.nextInt();

        if (n <= 0) {
            System.out.println("Enter a valid natural number.");

        } else {

            int i = 1;
            int sumWhile = 0;

            while (i <= n) {
                sumWhile = sumWhile + i;
                i++;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop = " + sumWhile);
            System.out.println("Sum using formula = " + sumFormula);

            if (sumWhile == sumFormula) {
                System.out.println("Result is correct. Both computations match");
            } else {
                System.out.println("Result is incorrect. Computations do not match");
            }
        }
    }
}
