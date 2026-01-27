import java.util.Scanner;



public class Level2PracticeProblem {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

            // Input salary
            System.out.print("Enter salary: ");
            double salary = c.nextDouble();

            // Input years of service
            System.out.print("Enter years of service: ");
            int years = c.nextInt();

            double bonus = 0.0;

            // Check if years of service > 5
            if (years > 5) {
                bonus = 0.05 * salary;
            }

            System.out.println("Bonus amount = " + bonus);
        }
}
