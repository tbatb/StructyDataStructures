package Stack;

import java.util.Map;
import java.util.Stack;

public class StackProblems {

    /**
     * Write a method, pairedParentheses, that takes in a string as an argument.
     * The method should return a boolean indicating whether the string has well-formed parentheses.
     * You may assume the string contains only alphabetic characters, '(', or ')'.
     *
     * @param str
     * @return boolean indicating if the string has well-formed parantheses.
     */
    public static boolean pairedParentheses(String str){
        // todo
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                if (count > 0) {
                    count--;
                } else {
                    return false;
                }
            }

        }
        return count == 0;

    }

    /**
     * Write a method, befittingBrackets, that takes in a string as an argument.
     * The method should return a boolean indicating whether or not the string contains
     * correctly matched brackets.
     * You may assume the string contains only characters: ( ) [ ] { }
     *
     * @param str
     * @return
     */
    public static boolean befittingBrackets(String str){
        // todo
        Map<Character, Character> brackets = Map.of(
                '{', '}',
                '(', ')',
                '[', ']'
        );

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (brackets.containsKey(ch)) {
                stack.push(brackets.get(ch));
            } else {
                if (!stack.isEmpty() && stack.peek() == ch) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    /**
     * Write a method, decompressBraces, that takes in a compressed string as an argument.
     * The method should return the string decompressed.
     * The compression format of the input string is 'n{subString}',
     * where the subString within braces should be repeated n times.
     * You may assume that every number n is guaranteed to be an integer between 1 through 9.
     * You may assume that the input is valid and the decompressed string will only contain alphabetic characters.
     *
     * @param str
     * @return
     */
    public static String decompressBraces(String str){
        // todo
        String numbers = "123456789";
        Stack<String> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            //if char in the index of ...
            if (numbers.indexOf(ch) > -1) {
                stack.push(String.valueOf(ch));
            } else {
                if (ch == '}') {
                    String segment = "";
                    while (!numbers.contains(stack.peek())) {
                        segment = stack.pop() + segment;
                    }
                    int number = Integer.valueOf(stack.pop());
                    stack.push(segment.repeat(number));
                } else if (ch != '{') {
                    stack.push(String.valueOf(ch));
                }
            }

        }
        return String.join("", stack);
    }

    /**
     * Write a method, nestingScore, that takes in a string of brackets as an argument.
     * The method should return the score of the string according to the following rules:
     * [] is worth 1 point
     * XY is worth m + n points where X, Y are substrings of well-formed brackets and m, n are their respective scores
     * [S] is worth 2 * k points where S is a substring of well-formed brackets and k is the score of that substring
     * You may assume that the input only contains well-formed square brackets.
     *
     * @param str
     * @return
     */
    public static int nestingScore(String str){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                stack.push(0);
            } else {
                int popped = stack.pop();
                if (popped == 0) {
                    stack.push(stack.pop() + 1);
                } else {
                    stack.push(stack.pop() + 2 * popped);
                }
            }
        }
        return stack.get(0);
    }

}
