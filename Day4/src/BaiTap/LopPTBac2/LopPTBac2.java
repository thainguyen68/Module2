package BaiTap.LopPTBac2;

import java.util.Scanner;

public class LopPTBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        double a = scanner.nextDouble();
        System.out.println("nhập b");
        double b = scanner.nextDouble();
        System.out.println("nhập c");
        double c = scanner.nextDouble();

        Loop loop = new Loop(a,b,c);
        System.out.println("Các số nhập vào a,b,c lần lượt là: " + loop);

        System.out.println(loop.getDiscriminant());

       if (loop.getDiscriminant() > 0) {
            System.out.println("nhiệm x1 = " + loop.getRoot1());
            System.out.println("nhiệm x2 = " + loop.getRoot2());
      }
        if (loop.getDiscriminant() == 0) {
            System.out.println("nhiệm kép x1,2 = " + loop.getRoot1());
        }
        if (loop.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        }
    }
}
