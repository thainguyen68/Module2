package miniTest;

import java.util.Scanner;

public class MainProduct {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số lượng sản phẩm: ");
        int num = scanner.nextInt();
        Product[] products = new Product[num];
        for (int i = 0; i < products.length; i++) {
            products[i] = MethodPro.getProduct();
        }

//        MethodPro.displayPro(products);
//        MethodPro.search(products);
//        MethodPro.sumPriceAllProduct(products);
//        MethodPro.editProduct(products);

        int choice ;
        do {
            System.out.println("Nhập điều bạn muốn:");
            System.out.println("1 Nếu bạn muốn hiển thị danh sách sản phẩm" + "\n" +
                    "2 Nếu bạn muốn tìm kiếm sản phẩm\n" +
                    "3 Nếu bạn muốn tinh tổng giá các sản phẩm\n" +
                    "4 Nếu bạn muốn sửa sản phẩm\n" +
                    "5 Nếu bạn muốn xóa sản phẩm\n"+
                    "0 Nếu muốn dừng chương trình1");
//            choice = Integer.parseInt(scanner.nextLine());
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    MethodPro.displayPro(products);
                    break;
                case 2:
                    MethodPro.search(products);
                    break;
                case 3:
                    MethodPro.sumPriceAllProduct(products);
                    break;
                case 4:
                    MethodPro.editProduct(products);
                    break;
                case 5:
                    MethodPro.deleteProduct(products);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại:");
            }
        }
        while (true);
    }
}
