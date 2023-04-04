package BaiTap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5};
        int [] arr1 = {6,7,8,9,10};
        int [] arr2 = new int[11];
        int k = 0;

        for (int i = 0; i < arr.length ; i++) {
            arr2[i] = arr[i];
        }
        for (int j = arr.length; j < arr2.length ; j++) {
            arr2[j] = arr1[k];
            k++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
