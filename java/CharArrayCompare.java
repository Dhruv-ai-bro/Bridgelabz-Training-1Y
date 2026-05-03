import java.util.Scanner;

public class CharArrayCompare {
    public static char[] getCharsManually(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }


    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String str = sc.next();


        char[] manualArray = getCharsManually(str);


        char[] builtInArray = str.toCharArray();


        boolean result = compareCharArrays(manualArray, builtInArray);


        System.out.print("Manual char array: ");
        for (char c : manualArray) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.print("Built-in char array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println();


        System.out.println("Are both arrays same? " + result);
    }
}
