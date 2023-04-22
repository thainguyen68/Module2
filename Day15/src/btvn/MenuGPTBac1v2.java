package btvn;

import java.util.Scanner;

public class MenuGPTBac1v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                int choice;
                do {
                    System.out.println("<--------------Menu------------->");
                    System.out.println("1. Giải phương trình bậc 1");
                    System.out.println("2. Giải phương trình bậc 2");
                    System.out.println("0. Thoát khỏi chương trình.");
                    System.out.println("nhập lựa chọn của bạn: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            PhuongTrinhBac1(scanner);
                            break;
                        case 2:
                            PhuongTrinhBac2(scanner);
                            break;
                        case 0:
                            System.exit(0);
                    }
                } while (choice != 0);
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai rồi, nhập lại số vào đây: ");
            }
        }
    }

    public static void PhuongTrinhBac1(Scanner scanner) {
        try {
            System.out.println("Dạng của phương trình bậc 1: ax + b = 0");
            System.out.println("a: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("b: ");
            double b = Double.parseDouble(scanner.nextLine());


            if (a != 0) {
                double x = b / a;
                System.out.println("Kết quả: x = " + x);
            } else {
                if (b == 0) {
                    System.out.println("Kết quả: có vô số nghiệm");
                } else {
                    System.out.println("Kết quả: vô nghiệm");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai rồi, nhập lại số vào đây: ");
        } finally {
            System.out.println("Hoàn thành");
        }
    }


    public static void PhuongTrinhBac2(Scanner scanner) {
       try{
           System.out.println("Phương trình bậc 2 có dạng: ax^2 + bx + c = 0");
           System.out.println("a: ");
           double a = Double.parseDouble(scanner.nextLine());
           System.out.println("b: ");
           double b = Double.parseDouble(scanner.nextLine());
           System.out.println("c: ");
           double c = Double.parseDouble(scanner.nextLine());
           if (a != 0) {
               if (b == 0) {
                   if (c == 0) {
                       System.out.println("Kết quả: vô số nghiệm");
                   } else {
                       System.out.println("Kết quả: vô nghiệm:");
                   }
               } else {
                   double x = -c / b;
                   System.out.println("Kết quả: x = " + x);
               }
           } else {
               System.out.println("Tính delta của phương trình bậc 2: delta = b^2 -4ac");
               double delta = b * b - 4 * a * c;
               if (delta < 0) {
                   System.out.println("Kết quả: vô nghiệm");
               } else if (delta == 0) {
                   double x = -b / (2 * a);
                   System.out.println("Kết quả: có nghiệm kép x = " + x);
               } else {
                   double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                   double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                   System.out.println("Kết quả: có 2 nghiệm x1, x2 lần lượt là x1 = "+x1 +" x2 = "+x2);
               }
           }
       } catch (NumberFormatException e) {
           System.out.println("Nhập sai rồi, nhập lại số vào đây: ");
       }
    }

}
