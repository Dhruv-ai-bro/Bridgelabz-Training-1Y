import java.util.Scanner;
public class TriangularParkRun {
    public static double calculateRounds(double a, double b, double c) {

        double perimeter = a + b + c;

        double totalDistance = 5000;

        double rounds = totalDistance / perimeter;

        return rounds;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter side 1 in meters: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 in meters: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 in meters: ");
        double side3 = sc.nextDouble();


        double roundsNeeded = calculateRounds(side1, side2, side3);


        System.out.println("Rounds needed to complete 5 km run = " + roundsNeeded);
    }
}
