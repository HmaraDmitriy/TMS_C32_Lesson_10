package com.teachmeskills.lesson_10.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cvv == card.cvv && Objects.equals(cardNumber, card.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cvv);
    }
}
