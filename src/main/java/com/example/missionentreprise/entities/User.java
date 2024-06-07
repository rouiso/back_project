package com.example.missionentreprise.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String  password;
    private String email;
    private String profileImageUrl;
    private int tel;
    private String role;

    //bidirectionnal
    @OneToMany(mappedBy = "user")
    private List<Product> products;

    @OneToMany(mappedBy = "user")
    private List<Event> events;

    @OneToMany(mappedBy = "user")
    private List<Feedback> feedbacks;


}
