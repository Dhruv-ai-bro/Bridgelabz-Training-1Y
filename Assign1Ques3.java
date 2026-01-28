import java.util.Scanner;
public class Assign1Ques3 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter your temperature in celsius");
        int Celsius = c.nextInt();
        float Faranheit = (Celsius * 9/5f) + 32f;
        System.out.print("The Temperature in Faranheit is "+Faranheit);
        System.out.println(" Degree Faranheit");
    }
}
