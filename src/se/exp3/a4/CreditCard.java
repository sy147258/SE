package se.exp3.a4;

/**
 * A1-4 Payment 泛化子类：信用卡
 */
public class CreditCard extends Payment {
    private String cardNumber;  // - cardNumber
    private String expiry;       // - expiry

    public CreditCard(String cardNumber, String expiry) {
        this.cardNumber = cardNumber;
        this.expiry = expiry;
    }

    @Override
    public boolean processPayment() {
        System.out.println("CreditCard 支付 ￥" + amount + " 卡号尾号 " + cardNumber);
        return true;
    }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }
    public String getExpiry() { return expiry; }
    public void setExpiry(String expiry) { this.expiry = expiry; }
}
