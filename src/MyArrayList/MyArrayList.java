package MyArrayList;

import java.util.ArrayList;

public class MyArrayList {
    private String[] array = new String[10];
    private int[] matrix = new int[10];
    private int size = 0;

    /**
     * Adds element to array and increases size.
     *
     * @param s
     */
    public void add(String s){
        array[size] = s;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    /**
     * removes an elment at a specific index and adjusts the size.
     *
     * @param index
     */
    public void remove(int index){
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void remove(String s){
        int idx = -1;
        for (int i = 0; i < size; i++) {
            if (s.equals(array[i])) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            remove(idx);
        }
    }

    public int getSize(){
        return size;
    }

    public String get(int index){
        return array[index];
    }
}
