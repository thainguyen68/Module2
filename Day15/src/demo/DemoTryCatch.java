package demo;

import java.util.Scanner;

public class DemoTryCatch {
    //try catch //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =0;
        try {
            System.out.println("nhập một số nguyên dương vào đây: ");
              n = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("không được lỗi rồi");
        }
        finally {
            System.out.println("Bye!!!"); //nhập sai vn hiển thị
        }

        System.out.println("Giá trị nhập vào là: " + n);
    }



}
