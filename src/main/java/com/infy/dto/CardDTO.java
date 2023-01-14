package com.infy.dto;

import java.time.LocalDate;

public class CardDTO {
    private Integer cardId;
    private String cardNumber;
    private LocalDate expiryDate;

    public CardDTO(){

    }

    public CardDTO(Integer cardId, String cardNumber, LocalDate expiryDate){
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public Integer getCardId() {
        return this.cardId;
    }

    public void setCardId(final Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(final String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(final LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "CardDTO{" +
                "cardId=" + cardId +
                ", cardNumber='" + cardNumber + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
