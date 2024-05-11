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

        System.out.println("decompress braces: ");
        System.out.println(StackProblems.decompressBraces("2{q}3{tu}v"));// -> qqtututuv
        System.out.println(StackProblems.decompressBraces("2{3{r4{e}r}io}"));// -> reeeerreeeerreeeerioreeeerreeeerreeeerio
        System.out.println(StackProblems.decompressBraces("3{al4{ec}2{icia}}"));// -> alececececiciaiciaalececececiciaiciaalececececiciaicia

        System.out.println("nesting Score: ");
        System.out.println(StackProblems.nestingScore("[[[[[[[][]]]]]]][]")); // -> 129
        System.out.println(StackProblems.nestingScore("")); // -> 0
        System.out.println(StackProblems.nestingScore("[[][][]]")); // -> 6

        System.out.println("===================================================");
        DiStack stack = new DiStack();
        System.out.println("push");
        stack.push(15);
        stack.push(8);
        stack.push(10);
        stack.push(7);
        stack.push(110);
        stack.push(12);

        stack.show();
        System.out.println("===================================================");
        stack.pop();
        stack.show();
        System.out.println("===================================================");
        stack.peek();
        stack.show();
        System.out.println("===================================================");
        stack.size();
        System.out.println("size is: " + stack.size());
        System.out.println("Empty = " + stack.isEmpty());
        System.out.println("===================================================");
        stack.pop();
        stack.show();

    }
}
