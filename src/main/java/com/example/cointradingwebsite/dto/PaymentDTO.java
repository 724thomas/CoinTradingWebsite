package com.example.cointradingwebsite.dto;

public class PaymentDTO {

    private String id;
    private String email;
    private int amount;
    private String uid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public PaymentDTO(String id, String email, int amount, String uid) {
        this.id = id;
        this.email = email;
        this.amount = amount;
        this.uid = uid;
    }
}
