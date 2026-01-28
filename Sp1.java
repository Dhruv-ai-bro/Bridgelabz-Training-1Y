import java.util.Scanner;

public class Sp1 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter your principal");
        float p = c.nextFloat();
        System.out.println("Enter your rate");
        float r = c.nextFloat();
        System.out.println("Enter your time");
        float t = c.nextFloat();
        float SimpleInterest = (p*r*t)/100;
        System.out.println("Your simple interest is: "+SimpleInterest);
    }
}
