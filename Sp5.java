import java.util.Scanner;

public class Sp5 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.print("Enter your distance in km:");
        float km = c.nextFloat();
        float miles = (float)(km * 0.621371);
        System.out.println("Your distance in miles is: "+miles);

    }
}
