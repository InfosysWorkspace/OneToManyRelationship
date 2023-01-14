package com.infy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Card {

    @Id
    private Integer cardId;
    private String cardNumber;
    private LocalDate expiryDate;

    public Card (){

    }

    public Card (Integer cardId, String cardNumber, LocalDate expiryDate){
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public Integer getCardId() {
        return this.cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId +
                ", cardNumber='" + cardNumber + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o || this.getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return this.cardId.equals(card.cardId) && this.cardNumber.equals(card.cardNumber) && this.expiryDate.equals(card.expiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.cardId, this.cardNumber, this.expiryDate);
    }
}
