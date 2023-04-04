package BaiTap;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class XoaPTKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số bất kỳ mà bạn muốn xóa:");
        int a = scanner.nextInt();
        int[] array = new int[5];

        array[0] = 3;
        array[1] = 4;
        array[2] = 5;
        array[3] = 6;
        array[4] = 7;

        int[] array1 = new int[5];
        int j=0;



        for (int i = 0; i < array.length ; i++) {
            if (a !=  array[i] ) {
                array1[j] = array[i];
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(array1[i]);
        }
    }
}
