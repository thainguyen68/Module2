package BaiTap;

public class HienThiSNT1 {
    public static void main(String[] args) {
        int count = 0;
        int dis;
    // hiển thị tt cả các số nguyên tố nhỏ hơn 100;
        for (int i = 0; i < 100; i++) {
            int a = i;
            for (int j = 2; j <= a; j++) {
                if (a == j) {
                    System.out.println("Các số nguyên đầu tiên nhỏ hơn 100 là: " + a );
                    count++;
                    break;
                }
                if (a % j == 0) {
                    break;
                }
            }
        }
    }
}
