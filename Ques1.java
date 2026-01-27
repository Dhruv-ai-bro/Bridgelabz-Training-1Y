import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter your number");
        String l;

        int a = c.nextInt();
        System.out.print("is the number "+a);

        if(a%5==0){
            l = "yes";
        }else{
             l = "no";
        }

        System.out.println(" divisible by 5?: "+l);
    }
}
