package btvnDaChua;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonManager personManager = new PersonManager();

        do {
            System.out.println("MENU");
            System.out.println("1. Tạo mới Person");
            System.out.println("2. Cập nhật Person");
            System.out.println("3. Xóa Person theo id");
            System.out.println("4. Sắp xếp Person theo tên");
            System.out.println("5. Hiển thị tất cả Person theo Address");
            System.out.println("6. Hiển thị tất cả Person");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    personManager.createPerson();
                    break;
                case 2:
                    personManager.updatePerson();
                    break;
                case 3:
                    personManager.deletePerson();
                    break;
                case 4:
                    personManager.sortPersonByName();
                    break;
                case 5:
                    personManager.displayAddPersonByAddress();
                    break;
                case 6:
                    personManager.displayAddPerson();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
