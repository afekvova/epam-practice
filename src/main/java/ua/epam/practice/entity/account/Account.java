package ua.epam.practice.entity.account;

import ua.epam.practice.entity.payment.Payment;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Account implements Serializable {

    private final long accountId;
    private BigDecimal balance;
    private List<Payment> paymentHistory;

    public Account(long accountId, BigDecimal balance, List<Payment> paymentHistory) {
        this.accountId = accountId;
        this.balance = balance;
        this.paymentHistory = paymentHistory;
    }

    public long getAccountId() {
        return this.accountId;
    }

    public void addPayment(Payment payment) {
        this.paymentHistory.add(payment);
    }

    public void deductAmount(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }

    public BigDecimal viewBalance() {
        return this.balance;
    }
}
