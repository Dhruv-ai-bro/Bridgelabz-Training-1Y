import java.util.Scanner;
public class Level26 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int number1 = c.nextInt();
        System.out.println("Enter the 2nd number");
        int number2 = c.nextInt();
        float Quotient = number1/number2;
        float remainder = number1%number2;
        System.out.print("The Quotient is "+Quotient);
        System.out.print(" and Remainder is "+remainder);
        System.out.print(" of two number "+number1);
        System.out.println(" and "+number2);
    }
}
