import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int number1 = c.nextInt();
        System.out.println("Enter the 2nd number");
        int number2 = c.nextInt();
        System.out.println("Enter the 3rd number");
        int number3 = c.nextInt();

        String l;

        if(number1>number2 && number1>number3){
            l = "Yes";
        }else{
            l = "no";
        }

        String m;

        if(number2>number1 && number2>number3){
            m = "yes";
        }else{
            m = "no";
        }

        String n;

        if(number3>number1 && number3>number2){
            n = "yes";
        }else{
            n = "no";
        }

        System.out.print("Is the first number the largest? ");
        System.out.println(l);
        System.out.print("Is the second number the largest? ");
        System.out.println(m);
        System.out.print("Is the third number the largest? ");
        System.out.println(n);

    }
}
