public class Introduction {
    public static double maxValue(double[] numbers) {
        // todo
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
        // todo
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

    public static String uncompress(String s) {
        // todo
        String numbers = "0123456789";
        String result = "";

        int i = 0;
        int j = 0;
        while (j < s.length()){
            String character = String.valueOf(s.charAt(j));
            if (numbers.contains(character)){
                j+=1;
            } else {
                int num = Integer.parseInt(s.substring(i, j));
                result += character.repeat(num);
                j += 1;
                i = j;
            }
        }
        return result;
    }

    public static String compress(String s) {
        // todo
        String result = "";
        int count = 1;
        int i = 1;
        int j = 1;
        while ( j < s.length()){
            if (s.charAt(j) == s.charAt(j-1)){
                count++;
                j++;
            } else if (count == 1){
                result += String.valueOf(s.charAt(i-1));
                j++;
                i = j;
            } else {
                result += count + String.valueOf(s.charAt(i-1));
                j++;
                i = j;
                count = 1;
            }
        }
        if (count == 1) {
            result += String.valueOf(s.charAt(i - 1));
        } else {
            result += count + String.valueOf(s.charAt(i - 1));
        }

        return result;
    }


    public static void run() {
        // this function behaves as `main()` for the 'run' command
        // you may sandbox in this function, but should not remove it
    }

}
