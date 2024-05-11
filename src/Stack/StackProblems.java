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
}
