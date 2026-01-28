import java.util.Scanner;
public class Basic15 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the quantity");
        int u = c.nextInt();
        System.out.println("Enter the price of one");
        float price = c.nextFloat();
        float TotalPrice = u * price;
        System.out.print("The total purchase price is INR "+TotalPrice);
        System.out.print(" if the quantity is "+u);
        System.out.println(" and unit price is "+price);
    }
}
