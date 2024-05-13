package Introduction;

public class StringOperations {

    private int resultStart;
    private int resultlength;

    /**
     * Find the longest palindrome in a subtring.
     *
     * @param s
     * @return Longest palindrome
     */
    public String longestPalindrom(String s){
        int strlength = s.length();
        if (strlength < 2) {
            return s;
        }
        for (int start = 0; start < strlength - 1; start++) {
            expandRange(s, start, start);
            expandRange(s, start, start + 1);
        }
        return s.substring(resultStart, resultStart + resultlength);

    }

    /**
     * Helper method for my longestpalindrome method.
     *
     * @param str
     * @param begin
     * @param end
     */
    private void expandRange(String str, int begin, int end){
        while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
    }


}
