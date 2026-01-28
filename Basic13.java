import java.util.Scanner;
public class Basic13 {
    public static void main(String[] args){
        System.out.println("Enter the perimeter");
        Scanner c = new Scanner(System.in);
        float p = c.nextFloat();
        float side = p/4f;
        System.out.print("The length of the side is "+side);
        System.out.println(" whose perimeter is "+p);
    }
}
