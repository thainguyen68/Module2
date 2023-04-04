package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPTVaoMang {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        int [] arr1 = new int[12];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn thêm vào: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm vào");
        int index = scanner.nextInt();

        if (index <= -1 || index > arr.length - 1) {
            System.out.print(Arrays.toString(arr));
        }
        else {
            for (int i = 0; i < arr.length+1; i++) {
                if(index > i){
                    arr1[i] = arr[i];
                }
                else if(index == i){
                    arr1[i] = x;
                }
                else {arr1[i] = arr[i - 1];}
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
