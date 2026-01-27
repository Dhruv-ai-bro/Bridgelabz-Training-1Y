import java.util.Scanner;

public class Level1PracticeProblem10{
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        double total = 0.0;
        double number;

        System.out.print("Enter a number: ");
        number = c.nextDouble();

        while (number != 0) {
            total = total + number;

            System.out.print("Enter a number: ");
            number = c.nextDouble();
        }

        System.out.println("Total sum = " + total);
    }

}
