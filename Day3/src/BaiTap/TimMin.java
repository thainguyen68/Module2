package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử của mảng vào đây: ");
        int [] array = new int[5];

        array[0]=scanner.nextInt();
        array[1]=scanner.nextInt();
        array[2]=scanner.nextInt();
        array[3]=scanner.nextInt();
        array[4]=scanner.nextInt();
        System.out.println("Phần tử của mảng: " + Arrays.toString(array));

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i] ){
                min = array[i];
            }
        }
        System.out.println("Min: "+min);
    }
}
