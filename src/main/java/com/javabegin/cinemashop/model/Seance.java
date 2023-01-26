package com.javabegin.cinemashop.model;

import lombok.Data;

import java.util.List;

@Data
public class Seance {
    private String name;
    private List<User> userList;
}
