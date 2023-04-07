package miniTest;

import java.util.Scanner;

public class MainProduct {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số lượng sản phẩm: ");

        int num = scanner.nextInt();
        Product[] products = new Product[num];
        for (int i = 0; i < products.length; i++) {
            products[i] = Product.getProduct();
        }

        //display Product:
        for (int j = 0; j < products.length; j++) {
            System.out.println(products[j]);
        }


        MethodPro.search(products);
        MethodPro.sumPriceAllProduct(products);



    }
}
