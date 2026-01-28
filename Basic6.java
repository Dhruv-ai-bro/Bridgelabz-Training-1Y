public class Basic6 {
    public static void main(String[] args){
        System.out.println("The fee of the college is 125000");
        int fee = 125000;
        int discount_percentage = 10;
        float discount = (float)(fee * 10/100);
        float finalprice = fee-discount;
        System.out.print("The discount amount is INR "+discount);
        System.out.println(" and final discounted fee is INR "+finalprice);
    }
}
