import java.util.Scanner;


public class Level3PracticeProblem3 {

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        System.out.print("Enter a number ");
        int number = c.nextInt();

        boolean isPrime = true;


        if (number <= 1) {
            isPrime = false;
        } else {

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }


        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }
    }

}
