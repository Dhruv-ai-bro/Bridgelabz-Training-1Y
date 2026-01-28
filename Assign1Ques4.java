import java.util.Scanner;

public class Assign1Ques4 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the radius");
        float r = c.nextFloat();
        float area = (float)(3.14 * r * r);
        System.out.println("Your area is: "+area);

    }
}
