package Recursion;
import java.util.List;
public class Recursion {
    /**
     * List.of(5, 2, 9, 19) --> 26
     * @param numbers
     * @return sum of arraylist
     */
    public static int sumNumbersRecursive(List<Integer> numbers) {
        if (numbers.size() == 0){
            return 0;
        }
        return numbers.get(0) + sumNumbersRecursive(numbers.subList(1, numbers.size()));
    }


    /**
     * Factorial 0 * 0 equals 1.
     * @param n
     * @return factorial of n
     */
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }


    /**
     * Input List.of("goat", "cat", "purple") --> should return 13.
     * sublist(0,    1,     2)
     * @param strings
     * @return length of arraylist
     */
    public static int sumOfLengths(List<String> strings) {
        if (strings.size() == 0){
            return 0;
        }
        return strings.get(0).length() + sumOfLengths(strings.subList(1, strings.size()));

    }

    /**
     * String s = (bcdef) -> (cdef) + b -> (def) + c -> (ef) + d -> (f) + e -> () + f
     * @param s
     * @return the given String s in reversed order.
     */
    public static String reverseString(String s) {
        if (s.length() == 0){
            return "";
        }

        return reverseString(s.substring(1)) + s.charAt(0);
    }

    /**
     *
     * @param s
     * @return Boolean true if given String s is a palindrome
     */
    public static boolean palindrome(String s) {
        if (s.length() == 0) return true;
        if (s.length() == 1) return true;

        if (s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        return palindrome(s.substring(1, s.length()-1));
    }

    /**
     * classic fibonacci
     * @param n
     * @return Fibanacci f(n)
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n-2) + fibonacci(n-1);

    }

    public static void main(String[] args){
        System.out.println(sumNumbersRecursive(List.of(5,2,9,10)));
        System.out.println(sumNumbersRecursive(List.of(10)));

    }
}
