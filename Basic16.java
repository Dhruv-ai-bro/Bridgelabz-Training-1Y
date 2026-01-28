import java.util.Scanner;
public class Basic16 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the number of people");
        int numberOfStudents = c.nextInt();
        int n;
        n = numberOfStudents;
        int NOHS = (n*(n-1))/2;
        System.out.println("The number of total handshakes are "+NOHS);
    }
}
