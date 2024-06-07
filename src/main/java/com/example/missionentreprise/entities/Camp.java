package com.example.missionentreprise.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Entity
public class Camp implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int tel;
    private String email;
    private String place;
    private String description;
    private Date startDate;
    private Date endDate;
    private double price;
    private int nbPlace;
    @OneToMany
    private List<Feedback>feedbacks;
}
