package com.example.app.SpringBootWebContacts.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private int id;
    private String img;
    private String firstName;
    private String lastName;
    private String phone;


}
