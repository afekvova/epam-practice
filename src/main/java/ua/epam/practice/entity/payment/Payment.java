package ua.epam.practice.entity.payment;

import com.sun.jmx.mbeanserver.NamedObject;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {

    private final long paymentId, studentId;
    private BigDecimal amount;
    private LocalDateTime paymentDate;
    private Status status;

    public Payment(long paymentId, long studentId, BigDecimal amount, LocalDateTime paymentDate, Status status) {
        this.paymentId = paymentId;
        this.studentId = studentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.status = status;
    }

    public void processPayment() {
        // Todo
    }


    public void refundPayment() {
        // Todo
    }

    public long getPaymentId() {
        return paymentId;
    }

    public long getStudentId() {
        return studentId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public Status getStatus() {
        return status;
    }
}
