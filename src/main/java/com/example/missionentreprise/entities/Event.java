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
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private Date endDate;
    private  Date startDate;
    private int nbParticipant;
    private double price;


    @ManyToOne
    private User user;

    @ManyToOne
    private Camp camp;


}
