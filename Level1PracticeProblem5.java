import java.util.Scanner;
public class Level1PracticeProblem5 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);


        System.out.print("Enter age: ");
        int age = c.nextInt();


        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

    }
}
