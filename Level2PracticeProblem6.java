import java.util.Scanner;



public class Level2PracticeProblem6 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = c.nextInt();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = c.nextInt();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = c.nextInt();


        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = c.nextDouble();

        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = c.nextDouble();

        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = c.nextDouble();


        int minAge = ageAmar;
        String youngest = "Amar";

        if (ageAkbar < minAge) {
            minAge = ageAkbar;
            youngest = "Akbar";
        }
        if (ageAnthony < minAge) {
            minAge = ageAnthony;
            youngest = "Anthony";
        }


        double maxHeight = heightAmar;
        String tallest = "Amar";

        if (heightAkbar > maxHeight) {
            maxHeight = heightAkbar;
            tallest = "Akbar";
        }
        if (heightAnthony > maxHeight) {
            maxHeight = heightAnthony;
            tallest = "Anthony";
        }


        System.out.println("The youngest friend is " + youngest + " with age " + minAge);
        System.out.println("The tallest friend is " + tallest + " with height " + maxHeight + " cm");
    }
}
