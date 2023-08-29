package com.jakubmikula;

import java.text.MessageFormat;

public class View {

    public void update(String name, int age, String email) {
//        System.out.println("Name: " + model.getName() + "\n" +
//                "Age: " + model.getAge() + "\n" +
//                "Email: " + model.getEmail());

        String message = MessageFormat.format("Name: {0}\nAge: {1}\nEmail: {2}\n", name, age, email);
        System.out.println(message);
    }
}
