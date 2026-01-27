import java.util.Scanner;


public class Level1PracticeProblem13 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = c.nextInt();


        if (n <= 0) {
            System.out.println("Please enter a valid natural number");
        } else {

            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor = sumFor + i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop = " + sumFor);
            System.out.println("Sum using formula  = " + sumFormula);

            if (sumFor == sumFormula) {
                System.out.println("Result is correct. Both computations match");
            } else {
                System.out.println("Result is incorrect. Computations do not match");
            }
        }
    }
}
