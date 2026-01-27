import java.util.Scanner;


public class Level2PracticeProblem5 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        System.out.print("Enter a positive integer ");
        int n = c.nextInt();
        if (n <= 0) {
            System.out.println("enter a positive integer");
        } else {

            int i = 1;
            while (i <= n) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
