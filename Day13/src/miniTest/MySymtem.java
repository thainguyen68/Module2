package miniTest;

import java.util.Scanner;

public class MySymtem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManage studentManage = new StudentManage();
        String classroom = new String();

        int choice;
        do {
            System.out.println("menu");
            System.out.println("1. hiển thị tất cả hs: ");
            System.out.println("2. tạo mới 1 hs: ");
            System.out.println("3. sửa thông tin hs bằng id: ");
            System.out.println("4. xóa thông tin hs bằng id: ");
            System.out.println("5. tìm thông tin hs bằng id: ");
            System.out.println("6. hiện thông tin hs bằng class: ");
            System.out.println("7. hiện thông tin hs bằng avg: ");
            System.out.println("8. hiện thông tin hs có avg Max: ");
            System.out.println("9. hiện thông tin hs có avg Min: ");
            System.out.println("10. tìm kiếm hs theo tên: ");
            System.out.println("Nhập lựa chọn bạn muốn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    studentManage.displayAll();
                    break;
                case 2:
                    studentManage.addStudent();
                    break;
                case 3:
                    studentManage.editStudent();
                    break;
                case 4:
                    studentManage.deleteStudent(scanner);
                    break;
                case 5:
                    studentManage.searchStudent(scanner);
                    break;
                case 6:
                    studentManage.displayStuClass(scanner);
                    break;
                case 7:
                    studentManage.displayStuAvg();
                    break;
                case 8:
                    studentManage.displayStuMaxAvg();
                    break;
                case 9:
                    studentManage.displayStuMinAvg();
                    break;
                case 10:
                    studentManage.searchStuName(scanner);
                    break;
            }

        }while (true);

    }
}
