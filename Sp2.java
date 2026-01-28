import java.util.Scanner;
public class Sp2 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the length");
        float l = c.nextFloat();
        System.out.println("Enter your breath");
        float b = c.nextFloat();
        float perimeter = (float)(2*l*b);
        System.out.println("The perimeter is"+perimeter);

    }
}
