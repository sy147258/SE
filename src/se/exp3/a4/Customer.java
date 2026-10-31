package se.exp3.a4;

import java.util.ArrayList;
import java.util.List;

/**
 * A1-4 网上购物系统
 * Customer (1) --- (1..*) Order
 */
public class Customer {
    private String name;     // - name
    private String email;    // - email
    private String phone;    // - phone
    private List<Order> orders = new ArrayList<>();

    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    /** + placeOrder() : Order */
    public Order placeOrder() {
        Order o = new Order(this);
        orders.add(o);
        return o;
    }

    /** + getOrders() : Order[*] */
    public List<Order> getOrders() { return orders; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
