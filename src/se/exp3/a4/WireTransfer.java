package se.exp3.a4;

/**
 * A1-4 Payment 泛化子类：银行转账
 */
public class WireTransfer extends Payment {
    private String bankName;  // - bankName

    public WireTransfer(String bankName) { this.bankName = bankName; }

    @Override
    public boolean processPayment() {
        System.out.println("WireTransfer 通过 " + bankName + " 支付 ￥" + amount);
        return true;
    }

    public String getBankName() { return bankName; }
    public void setBankName(String bankName) { this.bankName = bankName; }
}
