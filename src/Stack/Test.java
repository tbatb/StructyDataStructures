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

    }
}
