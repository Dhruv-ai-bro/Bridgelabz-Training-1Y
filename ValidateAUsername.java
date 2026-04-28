public class ValidateAUsername {

    public static boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }

        public static void main(String[] args){
            String[] testCases = {"user_123", "123user", "us"};

            for (String s : testCases) {
                System.out.println(s + " : " + isValidUsername(s));
            }
        }
    }
