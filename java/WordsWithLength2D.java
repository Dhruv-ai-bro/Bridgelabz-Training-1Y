import java.util.Scanner;

public class WordsWithLength2D {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }
        return count;
    }


    public static String[] splitManually(String text) {
        int len = findLength(text);


        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0, w = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[w++] = word;
                start = i + 1;
            }
        }


        String word = "";
        for (int j = start; j < len; j++) {
            word += text.charAt(j);
        }
        words[w] = word;

        return words;
    }


    public static String[][] create2DArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int len = findLength(words[i]);
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();


        String[] words = splitManually(text);
        String[][] table = create2DArray(words);


        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < table.length; i++) {
            String word = table[i][0];
            int length = Integer.parseInt(table[i][1]); // String → int
            System.out.println(word + "\t" + length);
        }

    }
}
