import java.util.Scanner;



public class Level2PracticeProblem8 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);


        System.out.print("Enter a positive integer ");
        int number = c.nextInt();


        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            System.out.println("Factors of " + number + " are ");

            int i = 1;
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
