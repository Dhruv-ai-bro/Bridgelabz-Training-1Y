import java.util.Scanner;
public class Basic10 {
    public static void main(String[] args){
        System.out.println("Enter your height in cm");
        Scanner c = new Scanner(System.in);
        double h = c.nextDouble();
        double inches = h/2.54;
        double feet = h/30.48;
        System.out.print("Your height in cm is "+h);
        System.out.print(" while in feet is "+feet);
        System.out.println(" and inches is "+inches);
    }
}
