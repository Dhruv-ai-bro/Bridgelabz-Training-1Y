import java.util.Scanner;


public class Level2PracticeProblem3 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);


        System.out.print("Enter a number ");
        int number = c.nextInt();


        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
