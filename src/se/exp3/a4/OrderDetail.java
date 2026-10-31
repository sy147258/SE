package se.exp3.a4;

/**
 * A1-4 OrderDetail
 * OrderDetail (1) --- (1) Product
 */
public class OrderDetail {
    private int quantity;   // - quantity
    private double price;   // - price
    private Product product;

    public OrderDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price = product.getPrice();
    }

    /** + calculateSubtotal() : real */
    public double calculateSubtotal() { return price * quantity; }

    /** + calculateWeight() : real */
    public double calculateWeight() { return product.getWeight() * quantity; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
}
