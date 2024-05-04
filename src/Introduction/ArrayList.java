package Introduction;
import java.util.List;
import java.util.Collections;
public class ArrayList {
    public static List<Integer> fiveSort(List<Integer> array) {
        // in-place, two pointer strategy
        int i = 0;
        int j = array.size()-1;
        while (i < j){
            if (array.get(j) == 5){
                j--;
            } else if (array.get(i) != 5){
                i++;
            } else {
                Collections.swap(array, i, j);
            }

        }
        return array;
    }
}
