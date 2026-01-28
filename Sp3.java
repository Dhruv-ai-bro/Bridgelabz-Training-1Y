import java.util.Scanner;
public class Sp3 {
    public static void main(String[] args){
        System.out.println("Enter the base");
        Scanner c = new Scanner(System.in);
        int b = c.nextInt();
        System.out.println("Enter the power");
        int p = c.nextInt();
        double result = Math.pow(b,p);
        System.out.println(result);

    }
}
