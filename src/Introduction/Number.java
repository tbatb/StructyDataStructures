package Introduction;

public class Number {
    public static double maxValue(double[] numbers) {
        int i = 0;
        double  max = numbers[i];
        // use negative infinity to cover the edge case for negative normal numbers.
        double inf = Double.NEGATIVE_INFINITY;

        while (i < numbers.length){
            if (numbers[i] > max){
                max = numbers[i];
            }
            i++;
        }



        return max;
    }

    public static boolean isPrime(int number) {
        if (number <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }



    public static void run() {
        // this function behaves as `main()` for the 'run' command
        // you may sandbox in this function, but should not remove it
    }

}
