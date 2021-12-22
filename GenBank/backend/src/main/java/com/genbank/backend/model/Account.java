package com.genbank.backend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Account {
    private long accNo;
    private float balance;
    private String firstName;
    private String LlastName;
    private String panNo;
    private String aadharNo;
    public long getAccNo() {
        return accNo;
    }
    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLlastName() {
        return LlastName;
    }
    public void setLlastName(String llastName) {
        LlastName = llastName;
    }
    public String getPanNo() {
        return panNo;
    }
    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }
    public String getAadharNo() {
        return aadharNo;
    }
    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account [LlastName=" + LlastName + ", aadharNo=" + aadharNo + ", accNo=" + accNo + ", balance="
                + balance + ", firstName=" + firstName + ", panNo=" + panNo + "]";
    }
    
}
