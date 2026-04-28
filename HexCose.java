public class HexCose {
    public static boolean isValidHex(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }

    public static void main(String[] args) {
        String[] test = {"#A1B2C3", "#123abc", "#FFF", "123456", "#ZZZZZZ"};

        for (String s : test) {
            System.out.println(s + " → " + isValidHex(s));
        }
    }
}
