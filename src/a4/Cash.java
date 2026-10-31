package se.exp3.a4;

/**
 * A1-4 Payment 泛化子类：现金
 */
public class Cash extends Payment {
    @Override
    public boolean processPayment() {
        System.out.println("Cash 支付 ￥" + amount);
        return true;
    }
}
