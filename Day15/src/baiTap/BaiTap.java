package baiTap;

import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập cạnh thứ nhất tam giác");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh thứ hai tam giác");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh thứ 3 tam giác");
                double c = Double.parseDouble(scanner.nextLine());
                if (a < 0 || b < 0 || c < 0) {
                    throw new ArithmeticException("Không phải là cạnh tam giác");
                }
                else if (a + b <= c || a + c <= b || b + c <= a) {
                    throw new ArithmeticException("Không phải cạnh tam giác");
                }
                else {
                    System.out.println("Đây là tam giác");
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage() + "\n" + "Mời nhập lại " + " \n");
            } catch (NumberFormatException e) {
                System.out.println("Cạnh phải là số" + "\n" + "Mời nhập lại" + "\n");
            }
        }
    }

}
