import java.util.Scanner;


public class Level3PracticeProblem5 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        int number = c.nextInt();

        int count = 0;


        if (number == 0) {
            count = 1;
        } else {

            while (number != 0) {


                number = number / 10;

                count++;
            }
        }


        System.out.println("Number of digits = " + count);
    }
}
