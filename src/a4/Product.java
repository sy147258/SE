package se.exp3.a4;

/**
 * A1-4 Product
 */
public class Product {
    private String name;   // - name
    private double price;  // - price
    private double weight; // - weight
    private int stock;     // - stock

    public Product(String name, double price, double weight, int stock) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.stock = stock;
    }

    /** + updateStock() */
    public void updateStock(int delta) { this.stock += delta; }

    /** + getInfo() : string */
    public String getInfo() { return name + " ￥" + price; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}
