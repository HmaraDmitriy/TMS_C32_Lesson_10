package com.teachmeskills.lesson_10.model;

public class Card {

    private String cardNumber;
    private int cvv;
    private double amount;

    public Card(double amount, int cvv, String cardNumber) {
        this.amount = amount;
        this.cvv = cvv;
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
