package Stack;

public class Test {
    public static void main(String[] args){
        System.out.println(StackProblems.befittingBrackets("(){}[](())")); // -> true
        System.out.println(StackProblems.befittingBrackets("({[]})")); // -> true
        System.out.println(StackProblems.befittingBrackets("({[]})")); // -> true
        System.out.println(StackProblems.befittingBrackets("{[]}({}")); // -> false
        System.out.println(StackProblems.befittingBrackets("[]{}(}[]")); // -> false
        System.out.println(StackProblems.befittingBrackets("{[(}])")); // -> false
        System.out.println(StackProblems.befittingBrackets("")); // -> true

    }
}
