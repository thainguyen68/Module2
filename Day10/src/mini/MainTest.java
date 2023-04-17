package mini;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PeopleManage peopleManage = new PeopleManage();
        Student student = new Student();
        System.out.println("Mời bạn nhập danh sách: ");
        peopleManage.create();

        int choice;
        do {
            System.out.println("------------------Menu-------------------");
            System.out.println("1. Hiển thị tất cả các đối tượng: ");
            System.out.println("2. Tạo thêm đối tượng: ");
            System.out.println("3. Sửa một đối tượng theo id: ");
            System.out.println("4. Xóa đi 1 đối tượng: ");
            System.out.println("5. Tính tổng điểm: ");
            System.out.println("6. Tìm vị trí đối tượng theo tên: ");
            System.out.println("7. Sắp xếp thứ tự theo điểm trung bình: ");
            System.out.println("Nhập lựa chọn mà bạn muốn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    peopleManage.displayAllPeople();
                    break;
                case 2:
                    peopleManage.addPeople();
                    break;
                case 3:
                    peopleManage.editPeople();
                    break;
                case 4:
                    peopleManage.deletePeople();
                    break;
                case 5:
                    peopleManage.totalAvg();
                    break;
                case 6:
                    peopleManage.searchPeople();
                    break;
                case 7:
                    peopleManage.arrangeAvgOfStudent();
                    break;
            }

        }while (true);
    }
}
