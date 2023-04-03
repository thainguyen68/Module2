import java.util.Scanner;
public class SoNgayCuaThang {

        public static void main(String[] args) {
            int month;
            Scanner number = new Scanner(System.in);
            System.out.println("Tháng bạn muốn kiểm tra:");
            month = number.nextInt();
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Có 31 ngày");
                    break;
                case 2:
                    System.out.println("Có 28 hoặc 29 ngày");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Có 30 ngày");
            }
        }
    }

