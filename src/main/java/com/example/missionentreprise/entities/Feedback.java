package com.example.missionentreprise.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Entity
public class Feedback implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int rating;
    private String comment;

    @ManyToOne
    private Camp camp;

    @ManyToOne
    private User user ;

}
