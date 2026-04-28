public class LisencePlate {
    public static boolean isValidPlate(String plate) {
        return plate.matches("^[A-Z]{2}[0-9]{4}$");
    }

    public static void main(String[] args) {
        String[] test = {"AB1234", "A12345", "ab1234", "XY9999"};

        for (String s : test) {
            System.out.println(s + " → " + isValidPlate(s));
        }
    }
}
