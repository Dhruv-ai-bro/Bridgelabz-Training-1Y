public class Basic7 {
    public static void main(String[] args){
        int rd = 6378;
        double volume =  (4.0f/3.0f) * Math.PI  * rd * rd * rd;
        double miles = 0.621f*volume;
        System.out.print("The volume of the earth in cubic kilometers is "+volume);
        System.out.println(" and cubic miles is "+miles);
    }
}
