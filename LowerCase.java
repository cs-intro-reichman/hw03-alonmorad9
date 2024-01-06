/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String emptyStr = "";
        // runs on the number of chars in the string
        for (int i = 0; i < s.length(); i++) {
            // if asci code of char is between 65 to 90 it's a capital letter
            if (s.charAt(i) >= 65 & s.charAt(i) <= 90) {
                // +32 in asci flips capital letter to small letter
                emptyStr = emptyStr + (char) (s.charAt(i) + 32);
            }
            // if it's not capital letter keep the char the same as is
            else
            emptyStr = emptyStr + s.charAt(i);
        }
        return emptyStr;
    }
}
