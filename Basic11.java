import java.util.Scanner;

public class Basic11 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the first number");
        float number1 = c.nextFloat();
        System.out.println("Enter the second number");
        float number2 = c.nextFloat();

        System.out.print("Addition is ");
        System.out.println(number1+number2);

        System.out.print("Subtraction is ");
        System.out.println(number1-number2);

        System.out.print("Multiplication is ");
        System.out.println(number1*number2);

        System.out.print("Division is ");
        System.out.println(number1/number2);

    }
}
