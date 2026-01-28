import java.util.Scanner;
public class Basic14 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter your distance in feet");
        float dis = c.nextFloat();
        float yard = dis/3f;
        float miles = dis/5280f;
        System.out.print("Your height in feet is "+dis);
        System.out.print(" While in yard it's "+yard);
        System.out.println(" and in miles it's "+miles);
    }
}
