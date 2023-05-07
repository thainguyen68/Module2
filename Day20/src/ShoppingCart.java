public class ShoppingCart {
    private int id;
    private Cart idCart;
    private Product product;
    private int quantity;

    public ShoppingCart() {
    }

    public ShoppingCart(Cart idCart, Product product, int quantity) {
        this.idCart = idCart;
        this.product = product;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getIdCart() {
        return idCart;
    }

    public void setIdCart(Cart idCart) {
        this.idCart = idCart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return id +"," + idCart + "," + product + "," + quantity ;
    }
}