public class DigitChecker {
    /**
     * This method checks whether a string consists only of digits using recursion.
     * It checks each character of the string recursively.
     * Time complexity: O(n), where n is the length of the string.
     * @param s The input string to be checked.
     * @return true if the string consists only of digits, false otherwise.
     */
    public boolean isDigits(String s){
        if(s.isEmpty())
            return true;
        char fChar = s.charAt(0);
        if(Character.isDigit(fChar))
            return isDigits(s.substring(1));
        else
            return false;
    }
}
