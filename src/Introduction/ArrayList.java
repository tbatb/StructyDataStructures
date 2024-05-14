package Introduction;
import java.util.List;
import java.util.Collections;
public class ArrayList {

    /**
     * Sorts all Numbers FIVE to the end of the array. Uses two pointer to through the List
     * Sorts number from i to j, if it is not filled with a FIVE already.
     * @param array
     * @return An array in which all Numbers FIVE are at the end.
     */
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
