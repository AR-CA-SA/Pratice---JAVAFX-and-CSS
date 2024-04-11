package com.example.guicoffeshop;

public class GiftCard extends Product {
    double balance;
    String specialMessage;
    public GiftCard(  double price, double balance, String specialMessage) {
        super( price);
        this.balance = balance;
        this.specialMessage = specialMessage;
    }

    public double getBalance(){
        return balance;
    }
    public String getSpecialMessage(){
        return specialMessage;
    }
}

