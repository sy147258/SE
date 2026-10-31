package se.exp3.a4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A1-4 Order
 * Order (1) --- (1..*) OrderDetail
 * Order (1) --- (1) Payment
 */
public class Order {
    private String orderId;          // - orderId
    private Date orderDate;          // - orderDate
    private double totalAmount;      // - totalAmount
    private Customer customer;
    private List<OrderDetail> details = new ArrayList<>();
    private Payment payment;

    public Order(Customer customer) {
        this.customer = customer;
        this.orderDate = new Date();
    }

    /** + addItem() */
    public void addItem(Product p, int qty) {
        details.add(new OrderDetail(p, qty));
    }

    /** + calculateTotal() : real */
    public double calculateTotal() {
        totalAmount = details.stream().mapToDouble(OrderDetail::calculateSubtotal).sum();
        return totalAmount;
    }

    public void setPayment(Payment p) { this.payment = p; }
    public Payment getPayment() { return payment; }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }
    public Date getOrderDate() { return orderDate; }
    public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public List<OrderDetail> getDetails() { return details; }
}
