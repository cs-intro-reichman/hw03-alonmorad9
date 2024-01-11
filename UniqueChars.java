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
        String calculatedString = "";
        // varibale that keeps the char at the current i
        // starting from 0 placement in the string
        char charAti = s.charAt(0);
        // runs on the number of chars in the string
        for (int i = 0; i < s.length(); i++) {
            // sets the value of the current char
            charAti = s.charAt(i);
            // adds all space chars to the new string 
            if (charAti == 32) {
                calculatedString = calculatedString + charAti;
            }
            // removes duplicates from the string unless it's space char
            else if (s.indexOf(charAti) == i) {
                calculatedString = calculatedString + charAti;
            }
        }
        return calculatedString;
    }
}
