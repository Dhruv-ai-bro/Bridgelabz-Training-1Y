import java.util.Scanner;
public class Basic8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        double km = input.nextDouble();
        double miles = km * 0.621;
        System.out.print("The total miles is "+miles);
        System.out.print(" mile for the given "+km);
        System.out.println("km");
    }
}
