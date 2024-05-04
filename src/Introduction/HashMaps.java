package Introduction;
import java.util.HashMap;
public class HashMaps {

    private static HashMap<Character, Integer> charCount(String s){
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()){
            if (count.get(c) == null){
                count.put(c, 0);
            }

            count.put(c, count.get(c)+1);
        }
        return count;
    }
    public static boolean isAnagram(String s1, String s2) {

        //  restful      fluster
        HashMap<Character, Integer> counts1 = charCount(s1);
        HashMap<Character, Integer> counts2 = charCount(s2);
        return counts1.equals(counts2);

    }

    public static char mostFrequentChar(String s) {
        // david -> d
        // i   j
        HashMap<Character, Integer> count = charCount(s);
        char mostFrequentChar = '\0';
        for (char c : s.toCharArray()){
            if (mostFrequentChar == '\0' || count.get(c) > count.get(mostFrequentChar)){
                mostFrequentChar = c;
            }
        }

        return mostFrequentChar;
    }




    public static void main(String[] args){



    }

}


