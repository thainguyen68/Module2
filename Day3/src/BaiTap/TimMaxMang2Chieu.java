package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TimMaxMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr1 = new int[2][2];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("Nhập vào phần tử " + i + " " + j + " của mảng thứ  ");
                arr1[i][j] = scanner.nextInt();
            }
        }
        // mảng tạo được:
        for (int i=0; i< arr1.length; i++ ){
            System.out.println(Arrays.toString(arr1[i]));
        }
        // liên kết phương thức tìm max:
        arr(arr1);
    }


    // kiểm tra Max:
    public static void arr(int[][] arr1) {
        int max = arr1[0][0];
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (max < arr1[i][j]){
                    max = arr1[i][j];
                }
            }
        }
        System.out.println("Max:" + max);
    }
}

