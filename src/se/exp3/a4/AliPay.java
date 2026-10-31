package se.exp3.a4;

/**
 * A1-4 Payment 泛化子类：支付宝
 */
public class AliPay extends Payment {
    private String alipayId;  // - alipayId

    public AliPay(String alipayId) { this.alipayId = alipayId; }

    @Override
    public boolean processPayment() {
        System.out.println("AliPay 账户 " + alipayId + " 支付 ￥" + amount);
        return true;
    }

    public String getAlipayId() { return alipayId; }
    public void setAlipayId(String alipayId) { this.alipayId = alipayId; }
}
