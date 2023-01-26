package com.javabegin.cinemashop.model;

import lombok.Data;

@Data
public class Ticket {
private Seance seance;
private String qrUUID; //QR код
private String seat;
}
