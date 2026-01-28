import java.util.Scanner;
public class Assign1Ques2 {
    public static void main(String[] args){
        System.out.println("Enter your numbers");
        System.out.println("enter the first number");
        Scanner c = new Scanner(System.in);
        int a = c.nextInt();
        System.out.println("enter the secound number");
        int b = c.nextInt();

        int sum = a+b;
        System.out.println("The Sum of the numbers is:"+sum);
    }
}
