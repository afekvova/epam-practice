package ua.epam.practice.entity.account.impl;

import ua.epam.practice.entity.Room;
import ua.epam.practice.entity.account.Account;
import ua.epam.practice.entity.payment.Payment;

import java.math.BigDecimal;
import java.util.List;

public class Student extends Account {

    private String name, email, phoneNumber;
    private Room room;
    private boolean isResident;


    public Student(String name, String email, String phoneNumber, Room room, boolean isResident, long accountId, BigDecimal balance, List<Payment> paymentHistory) {
        super(accountId, balance, paymentHistory);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.room = room;
        this.isResident = isResident;
    }


    public void login() {
        // Todo
    }

    public void logout() {
        // Todo
    }

    public void makePayment(Payment payment) {
        this.addPayment(payment);
    }

    public String viewRoomDetails() {
        return this.room.toString();
    }
}
