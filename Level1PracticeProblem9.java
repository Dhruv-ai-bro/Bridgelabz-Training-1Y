import java.util.Scanner;

public class Level1PracticeProblem9 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter countdown number: ");
        int counter = c.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Launch!");
    }
}
