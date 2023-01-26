package com.javabegin.cinemashop;

import com.javabegin.cinemashop.model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.List;

//@SpringBootApplication
public class CinemaShopApplication {
    static List<User> users = List.of(
            new User(1L,"login1",1000,null),
            new User(2L,"login2",1000,null),
            new User(3L,"login3",1000,null),
            new User(4L,"login4",1000,null),
            new User(5L,"login5",1000,null)
    );


    public static void main(String[] args) throws IOException {
//        SpringApplication.run(CinemaShopApplication.class, args);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Введите пользователя: ");
        String login = reader.readLine();
        User user1 = (User) users.stream().filter(user -> (user.getLogin().equals(login))).findFirst().get();
        System.out.println("Хочешь купить билет за 100тг?(Да) ");
        boolean buyTicket= reader.readLine().toLowerCase().equals("да");
        if (buyTicket && user1.getBalance()>100){
            user1.setBalance(user1.getBalance()-100);
            System.out.println(user1);
        }
    }
}
