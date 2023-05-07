import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageCart {
    Scanner scanner = new Scanner(System.in);
    List<Cart> carts;
    List<ShoppingCart> shoppingCarts;
    ManageProduct manageProduct;

    public ManageCart(ManageProduct manageProduct) {
        carts = new ArrayList<>();
        shoppingCarts = new ArrayList<>();
        this.manageProduct = manageProduct;
    }

    public void shopping() {
        System.out.println("Name user buy product: ");
        String name = scanner.nextLine();
        Cart cart = new Cart(name);
        for (Cart c : carts) {
            if (c.getName().equals(name) && !c.isPaid()) {
                cart = c;
            }
        }
        manageProduct.displayAll();
        Product p = manageProduct.getById();
        System.out.println("Enter the quantity you want to buy");
        int quantity = Integer.parseInt(scanner.nextLine());
        addCart(p, quantity, cart);
    }

    public void addCart(Product product, int quantity, Cart cart) {
        ShoppingCart s = new ShoppingCart(cart, product, quantity);
        shoppingCarts.add(s);
    }

    public void displayCart() {
        double sum = 0;
        for (ShoppingCart s : shoppingCarts) {
            sum += s.getProduct().getPrice() * s.getQuantity();
            System.out.println(s);
            System.out.println(sum);
        }
    }
}