package Introduction;

public class Compression {

    public static String uncompress(String s) {
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

    // ccaaatsss
    // i
    //   j

    public static String STRUCTY_compress (String s){

        s += "?";
        String result = "";
        int j = 0;
        int i = 0;

        while (j < s.length()){
            if (s.charAt(i) == s.charAt(j)){
                j += 1;
            } else {
                int count = j - i;
                if (count > 1){
                    result += count + String.valueOf(s.charAt(i));
                } else {
                    result += String.valueOf(s.charAt(i));

                }
                i = j;
            }
        }
        return result;
    }

    public static void main(String[] args){

        String s = "ccaaatsss";
        String newe = STRUCTY_compress(s);
        System.out.println(newe);
    }

}
