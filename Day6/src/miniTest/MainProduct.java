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

        MethodPro.displayPro(products);
        MethodPro.search(products);
        MethodPro.sumPriceAllProduct(products);
        MethodPro.EditProduct(products);



    }
}
