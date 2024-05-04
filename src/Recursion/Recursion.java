package Recursion;
import java.util.List;
public class Recursion {
    public static int sumNumbersRecursive(List<Integer> numbers) {
        if (numbers.size() == 0){
            return 0;
        }
        return numbers.get(0) + sumNumbersRecursive(numbers.subList(1, numbers.size()));
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int sumOfLengths(List<String> strings) {
        if (strings.size() == 0){
            return 0;
        }
        return strings.get(0).length() + sumOfLengths(strings.subList(1, strings.size()));

    }
    public static void main(String[] args){
        System.out.println(sumNumbersRecursive(List.of(5,2,9,10)));
        System.out.println(sumNumbersRecursive(List.of(10)));

    }
}
