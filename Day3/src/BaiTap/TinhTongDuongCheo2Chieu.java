package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongDuongCheo2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr1 = new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("Nhập vào phần tử " + i + " " + j + " của mảng ");
                arr1[i][j] = scanner.nextInt();
            }
        }
        // mảng tạo được:
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        //thực hiện tính tổng đường chéo:
        sum(arr1);
    }

    public static void sum(int[][]arr1) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr1.length ; i++) {
            sum+=arr1[i][i];
            sum1+=arr1[i][arr1.length - (i+1)];
            }
        System.out.println(sum);
        System.out.println(sum1);
        }
    }

