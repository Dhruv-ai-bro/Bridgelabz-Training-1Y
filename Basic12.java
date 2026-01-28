import java.util.Scanner;


public class Basic12 {
    public static void main(String[] args){
        System.out.println("Enter the base");
        Scanner c = new Scanner(System.in);
        float b = c.nextFloat();
        System.out.println("Enter the height");
        float h = c.nextFloat();
        Double AreaOfTriangle = 0.5 * b * h;
        double InInches = AreaOfTriangle*0.621;
        double InFeet = AreaOfTriangle/30.48;
        System.out.print("The area of the triangle in cm is "+AreaOfTriangle);
        System.out.print(" while in inches it's "+InInches);
        System.out.println(" and in Feet it's "+InFeet);
    }
}


