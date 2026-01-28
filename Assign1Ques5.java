import java.util.Scanner;
public class Assign1Ques5 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the height");
        float h = r.nextFloat();
        System.out.println("Enter the radius");
        float rd = r.nextFloat();
        float volume = (float)(3.14*rd*rd*h);
        System.out.print("The voulume is: "+volume);

    }

}
