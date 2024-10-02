package ua.epam.practice.entity.account.impl;

import ua.epam.practice.entity.Room;
import ua.epam.practice.entity.account.Account;
import ua.epam.practice.entity.payment.Payment;

import java.math.BigDecimal;
import java.util.List;

public class Admin extends Account {

    private String name, email, phoneNumber;


    public Admin(String name, String email, String phoneNumber, long accountId, BigDecimal balance, List<Payment> paymentHistory) {
        super(accountId, balance, paymentHistory);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void manageStudents() {
        // Todo
    }

    public void manageRooms() {
        // Todo
    }
}
