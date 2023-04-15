import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        MethodPhone methodPhone = new ManagePhone();
        ArrayList arrayList =new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ManagePhone managePhone = new ManagePhone(scanner);


        int choiceCase;
        do {
            System.out.println("----------------------Menu------------------------");
            System.out.println("1. Hiển thị danh sách: ");
            System.out.println("2. Thêm liên lạc danh sách: ");
            System.out.println("3. Xóa liên lạc khỏi danh sách: ");
            System.out.println("4. Cập nhật liên lạc trong danh sách: ");
            System.out.println("5. Sắp xếp liên lạc trong danh sách theo id: ");
            System.out.println("6.Tìm kiếm tên liên lạc trong danh sách: ");
            System.out.println("Mời bạn nhập lựa chọn:... ");
            choiceCase = Integer.parseInt(scanner.nextLine());
            switch (choiceCase) {
                case 1:
                    methodPhone.displayAllContact();
                    break;
                case 2:
                    methodPhone.insertPhone();
                    break;
                case 3:
                    methodPhone.removePhone();
                    break;
                case 4:
                    methodPhone.updatePhone();
                    break;
                case 5:
                    managePhone.sort();
                    break;
                case 6:
                    managePhone.searchPhone();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại:");
            }
        } while (true);
    }
}
