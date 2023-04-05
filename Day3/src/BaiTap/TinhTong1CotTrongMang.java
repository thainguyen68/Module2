package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTong1CotTrongMang {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] arr1 = new int[2][2];

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    System.out.println("Nhập vào phần tử " + i + " " + j + " của mảng thứ  ");
                    arr1[i][j] = scanner.nextInt();
                }
            }
            // nhập vị trí cột:5
             int colum = scanner.nextInt();

            // mảng tạo được:
            for (int i=0; i< arr1.length; i++ ){
                System.out.println(Arrays.toString(arr1[i]));
            }
            sum(arr1,colum);
    }

        public static void sum(int[][] arr1,int colum) {
             int count=0;
            for (int i = 0; i < arr1.length ; i++) {
               count += arr1[i][colum];
            }
            System.out.println("Tổng cột: "+count);
        }
}
