public class Basic4 {
    public static void main(String[] args) {
        System.out.println("The Selling price is INR 191");
        System.out.println(" and the cost price is INR 129");
        float Selling_Price = 191;
        float Cost_Price = 129;
        float profit = Selling_Price - Cost_Price;
        float Profit_Percentage = (float) ((profit / Cost_Price) * 100);
        System.out.print("The profit is " + profit);
        System.out.print(" and the profit percentage " + Profit_Percentage);
        System.out.print("%");
    }
}
