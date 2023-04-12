package mini;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Brand[] brandArr = new Brand[3];
        brandArr[0] = new Brand(1, "Apple");
        brandArr[1] = new Brand(2, "SamSung");
        brandArr[2] = new Brand(3, "Nokia");

        System.out.println("Nhập số lượng sản phẩm:");
        int num = scanner.nextInt();
        Product[] products = new Product[num];
        for (int i = 0; i < products.length; i++) {
            products[i] = addProduct(scanner, brandArr);
        }
        displayProducts(products);
    }

    public static Product addProduct(Scanner scanner, Brand[] brandArr) {
        System.out.println("Nhập tên:");
        String name = scanner.next();
        System.out.println("Nhập giá:");
        double price = scanner.nextDouble();
        System.out.println("Nhập mô tả:");
        String description = scanner.next();

        System.out.println("Nhập thương hiệu bạn muốn chon:");
        for (Brand brand : brandArr) {
            System.out.println(brand);
        }
        int choice = scanner.nextInt();
        Brand newBrand = new Brand();
        for (Brand brand : brandArr) {
            if (choice == brand.getId()) {
                newBrand = brand;
            }
        }
        return new Product(name, price, description, newBrand);
    }

    public static void displayProducts(Product[] products) {
        for (Product e : products) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }
}
