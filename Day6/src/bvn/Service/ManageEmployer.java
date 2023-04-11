package bvn.Service;

import bvn.Model.Employer;
import bvn.Model.FullTime;
import bvn.Model.PartTime;

import java.util.Scanner;

public class ManageEmployer {
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
    public static Employer[] addEmployer(Employer[] employers) {
        Employer[] employers1 = new Employer[employers.length + 1];
        for (int i = 0; i < employers.length; i++) {
            employers1[i] = employers[i];
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
//        System.out.println(Arrays.toString(employers));
        return employers1;
    }


    //deleteEmployer:
    public static Employer[] deleteEmployer(Employer[] employers, Scanner scanner) {
        System.out.println(" Nhập id nv cần xóa:");
        int idDelete = Integer.parseInt(scanner.nextLine());

        Employer[] employer2 = new Employer[employers.length - 1];
        int index = 0;
        for (int i = 0; i < employers.length; i++) {
            if (idDelete != employers[i].getId()) {
                employer2[index] = employers[i];
                index++;
            }
        }
//        System.out.println(Arrays.toString(employer1));
        return employer2;
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
