package btvn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ViTriCu {
    public static void main(String[] args) {
        int [] arr = {3,6,2,7};
        System.out.println("Mảng ban đầu:\n " + Arrays.toString(arr));
        Map<Integer, Integer> arrSort = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            arrSort.put(arr[i], i);
        }
        ArrayList<Integer> newArr = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        for (Map.Entry<Integer, Integer> arrSort2 : arrSort.entrySet()) {
            newArr.add(arrSort2.getKey());
            index.add(arrSort2.getValue());
        }
        System.out.println("Mảng sau khi sắp xếp tăng dần:\n " + newArr);
        System.out.println("Vị trí ban đầu của mỗi phần tử:\n " + index);
    }
}
