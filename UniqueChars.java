/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String emptyStr = "";
        char charAti = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            charAti = s.charAt(i);
            if (charAti == 32) {
                emptyStr = emptyStr + charAti;
            }
            else if (s.indexOf(charAti) == i) {
                emptyStr = emptyStr + charAti;
            }
        }
        return emptyStr;
    }
}
