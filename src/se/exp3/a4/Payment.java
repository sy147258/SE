package se.exp3.a4;

import java.util.Date;

/**
 * A1-4 Payment（抽象基类）
 * 泛化：CreditCard / Cash / WireTransfer / AliPay / WeixinPay
 */
public abstract class Payment {
    protected double amount;        // # amount
    protected Date paymentDate;     // # paymentDate

    public abstract boolean processPayment();

    public void setAmount(double amount) { this.amount = amount; }
    public double getAmount() { return amount; }
    public Date getPaymentDate() { return paymentDate; }
    public void setPaymentDate(Date paymentDate) { this.paymentDate = paymentDate; }
}
