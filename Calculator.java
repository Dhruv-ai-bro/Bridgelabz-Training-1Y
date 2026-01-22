import java.util.Scanner;

public class Calculator{
	public static void main(String...args){
		System.out.println("Enter your numbers");
		Scanner c = new Scanner(System.in);
		int a = c.nextInt();
		int b = c.nextInt();
		int d = c.nextInt();
		
		System.out.println("choose your operation");
		System.out.println("1.addition,2.Subtraction,3.multiply,4.division");
							
		int input = c.nextInt();
		
		if(input==1){
			System.out.println(a+b);
		}else if(input==2){
			System.out.println(a-b);
		}else if(input==3){
			System.out.println(a*b);
		}else if(input==4){
			System.out.println(a/b);
		}
   }
}