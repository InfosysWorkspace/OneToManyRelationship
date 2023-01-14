package com.infy.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    @Column(name = "emailId")
    private String emailId;
    private String name;
    private LocalDate dateOfBirth;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_id")
    private List<Card> cards;

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Card> getCards() {
        return this.cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", emailId='" + emailId + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", cards=" + cards +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o || this.getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return this.customerId.equals(customer.customerId) && this.emailId.equals(customer.emailId) && this.name.equals(customer.name) && this.dateOfBirth.equals(customer.dateOfBirth) && this.cards.equals(customer.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.customerId, this.emailId, this.name, this.dateOfBirth, this.cards);
    }
}
