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
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private Boolean available;
    private double price;
    private String state;
@ManyToOne
    private User user;
@OneToMany
    private List<Product>products;

}
