import java.util.Scanner;
public class Sp4 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = c.nextInt();
        System.out.print("Enter the second number:");
        int b = c.nextInt();
        System.out.print("Enter the third number:");
        int e = c.nextInt();
        float avg = (float)(a+b+e)/3;
        System.out.println("Your avg is:"+avg);
    }
}
