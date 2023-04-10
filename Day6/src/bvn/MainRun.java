package bvn;

import java.util.Arrays;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employer[] employers = new Employer[4];
        FullTime f = new FullTime(1, "NguyenNgu1", 21, 10);
        FullTime f1 = new FullTime(2, "NguyenNgu2", 22, 10);
        PartTime p = new PartTime(3, "Van A", 20, 24);
        PartTime p1 = new PartTime(4, "Van B", 21, 24);

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
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayFT(employers);
                    break;
                case 2:
                    displayPT(employers);
                    break;
                case 3:
                    addEmployer(employers);
                    break;
                case 4:
                    deleteEmployer(employers, scanner);
                    break;
                case 5:
                    editEmployer(employers);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn trên!");
            }
        } while (choice != 0);
    }


    //displayAll:
    public static void displayAllEmployer(Employer[] employers) {
        for (Employer e : employers) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }
    //displayFT:
    public static void displayFT(Employer[] employers) {
        for (int i = 0; i < employers.length; i++) {
            if (employers[i] instanceof FullTime)
                System.out.println(employers[i]);
        }
    }

    //displayPT
    public static void displayPT(Employer[] employers) {
        for (int i = 0; i < employers.length; i++) {
            if (employers[i] instanceof PartTime)
                System.out.println(employers[i]);
        }
    }



    //addEmployer:
    public static void addEmployer(Employer[] employers) {
        Employer[] employers1 = new Employer[employers.length + 1];
        int index =0;
        for (int i = 0; i < employers.length; i++) {
            employers1[index] = employers[i];
            index++;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 để add FullTime ");
        System.out.println("Nhập 2 để add PartTime ");
        int choice1 = Integer.parseInt(scanner.nextLine());
        switch (choice1) {
            case 1:
                FullTime f2 = new FullTime(5, "NguyenNgu3", 35, 5);
                employers1[employers1.length-1] = f2;
                break;
            case 2:
                PartTime p2 = new PartTime(6, "Van C", 30, 30);
                employers1[employers1.length-1] = p2;
                break;
        }
        employers = employers1;
//        System.out.println(Arrays.toString(employers));
        displayAllEmployer(employers);
    }


    //deleteEmployer:
    public static void deleteEmployer(Employer[] employers, Scanner scanner) {
        System.out.println(" Nhập id nv cần xóa:");
        int idDelete = Integer.parseInt(scanner.nextLine());

        Employer[] employer1 = new Employer[employers.length - 1];
        int index = 0;
        for (int i = 0; i < employers.length; i++) {
            if (idDelete != employers[i].getId()) {
                employer1[index] = employers[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(employer1));
    }


    //editEmployer:
    public static void editEmployer(Employer[] employers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id nv muốn sửa:");
        int edit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employers.length; i++) {
            if (edit == employers[i].getId()) {
                System.out.println("Name");
                String name = scanner.nextLine();
                employers[i].setName(name);
                System.out.println("Age");
                int age= scanner.nextInt();
                employers[i].setAge(age);
                if (employers[i] instanceof FullTime){
                    System.out.println("Năm làm việc");
                    int time = scanner.nextInt();
                    ((FullTime) employers[i]).setYearOfExp(time);
                }else {
                    System.out.println("Giờ làm việc");
                    int time = scanner.nextInt();
                    ((PartTime) employers[i]).setWorkTime(time);
                }
            }
        }
//        System.out.println(Arrays.toString(employers));
        displayAllEmployer(employers);
    }

}
