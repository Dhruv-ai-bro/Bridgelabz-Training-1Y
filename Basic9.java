import java.util.Scanner;
public class Basic9 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the fee");
        double fee = c.nextDouble();
        System.out.println("Enter the discounted percentage");
        double discountPercent = c.nextDouble();
        double discountamount = fee * discountPercent/100;
        System.out.print("The discount amount is INR "+discountamount);
        double finalprice = fee-discountamount;
        System.out.println(" and final discounted fee is INR "+finalprice);
    }
}
