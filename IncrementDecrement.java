import java.util.Scanner;

public class IncrementDecrement{
	public static void main(String[] args){
		int i = 0;
		System.out.println("val:"+i);
		i++;
		System.out.println("val:"+ i++);
		System.out.println("val:"+ i);
		++i;
		System.out.println("valc:"+i++);
		System.out.println("valc"+i++);
		
		int z = i - i++ - --i + i - ++i + i++;
		
		
		System.out.println(z);
		
		for(int k = 0;k<10;k++){
			System.out.println("k:" +k);
		}
		
		int j = 10;
		while(j>0){
			System.out.println("j:"+j);
			j--;
		}
		
		
		
	}
}