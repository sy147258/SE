package se.exp3.a4;

/**
 * A1-4 Payment 泛化子类：微信支付
 */
public class WeixinPay extends Payment {
    private String openId;  // - openId

    public WeixinPay(String openId) { this.openId = openId; }

    @Override
    public boolean processPayment() {
        System.out.println("WeixinPay openId " + openId + " 支付 ￥" + amount);
        return true;
    }

    public String getOpenId() { return openId; }
    public void setOpenId(String openId) { this.openId = openId; }
}
