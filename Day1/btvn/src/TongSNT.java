import java.util.Scanner;
public class TongSNT {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
            for (int i = 0; i < 1000; i++) {
                int a = i;
                for (int j = 2; j <= a; j++) {
                    if (a == j) {
                        sum += a;
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
        System.out.println("Tổng 20 số nguyên đầu tiên là: " + sum);
    }
}
