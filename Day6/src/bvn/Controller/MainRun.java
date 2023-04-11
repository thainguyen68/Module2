package bvn.Controller;

import bvn.Model.Employer;
import bvn.Model.FullTime;
import bvn.Model.PartTime;
import bvn.Service.ManageEmployer;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Nhập số lượng nv");
//        int num = scanner.nextInt();
//        Employer[] employers = new Employer[num];


        Employer[] employers = new Employer[4];
        FullTime f = new FullTime( "NguyenNgu1", 21, 10);
        FullTime f1 = new FullTime( "NguyenNgu2", 22, 10);
        PartTime p = new PartTime( "Van A", 20, 24);
        PartTime p1 = new PartTime( "Van B", 21, 24);

        employers[0] = (Employer) f;
        employers[1] = (Employer) f1;
        employers[2] = (Employer) p;
        employers[3] = (Employer) p1;

        int choice;
        do {
            System.out.println("----------MENU----------");
            System.out.println("1.hiển thị nv fullTime");
            System.out.println("2.hiển thị nv partTime");
            System.out.println("3.thêm một nhân viên mới:");
            System.out.println("4.xóa đi một nhân viên");
            System.out.println("5.sửa một nhân viên theo id");
            System.out.println("6.hiển thị toàn bộ nhân viên");
            System.out.println("0.thoát khỏi chương trình");
            choice = Integer.parseInt(scanner.nextLine());
//            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ManageEmployer.displayFT(employers);
                    break;
                case 2:
                    ManageEmployer.displayPT(employers);
                    break;
                case 3:
                    employers=ManageEmployer.addEmployer(employers);
                    break;
                case 4:
                    employers=ManageEmployer.deleteEmployer(employers, scanner);
                    break;
                case 5:
                    ManageEmployer.editEmployer(employers);
                    break;
                case 6:
                    ManageEmployer.displayAllEmployer(employers);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn trên!");
            }
        } while (choice != 0);
    }




}
