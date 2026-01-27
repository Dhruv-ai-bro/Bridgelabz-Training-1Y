import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter your natural number");
        int n = c.nextInt();

        if(n>=0 && !(n<0) ){
            float sum = (n*(n-1))/2;
            System.out.print("The sum of "+n);
            System.out.println(" natural number is "+sum);
        }else{
            System.out.print("The number "+n);
            System.out.println(" is not a natural number");
        }
    }
}
