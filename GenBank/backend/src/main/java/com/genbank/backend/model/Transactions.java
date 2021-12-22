package com.genbank.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transactions")
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Account fromAcc;
    private Account toAcc;
    private float amount;
    private String date;
    private String time;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Account getFromAcc() {
        return fromAcc;
    }
    public void setFromAcc(Account fromAcc) {
        this.fromAcc = fromAcc;
    }
    public Account getToAcc() {
        return toAcc;
    }
    public void setToAcc(Account toAcc) {
        this.toAcc = toAcc;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public String toString() {
        return "Transactions [amount=" + amount + ", date=" + date + ", fromAcc=" + fromAcc + ", id=" + id + ", time="
                + time + ", toAcc=" + toAcc + "]";
    }
}
