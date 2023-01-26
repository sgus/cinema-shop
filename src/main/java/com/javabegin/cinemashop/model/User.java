package com.javabegin.cinemashop.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

public class User {
    private Long id;
    private String login;
    private Integer balance;
    private Ticket ticket;

    public User() {
    }

    public User(Long id, String login, Integer balance, Ticket ticket) {
        this.id = id;
        this.login = login;
        this.balance = balance;
        this.ticket = ticket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
