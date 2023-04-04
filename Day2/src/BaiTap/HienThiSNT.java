package BaiTap;

//import java.util.Scanner;

public class HienThiSNT {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < 1000; i++) {
            int a = i;
            for (int j = 2; j <= a; j++) {
                if (a == j) {
                    System.out.println("Hiển thị 20 số nguyên đầu tiên là: " + a );
                    count++;
                    break;
                }
                if (a % j == 0) {
                    break;
                }
            }
            if (count == 20) {
                break;
            }
        }
    }
}
