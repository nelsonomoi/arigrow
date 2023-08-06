package com.oumoi.arigrow.parameters.domain.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    private String description;

    private Double price;

    @ManyToOne
    private Category category;


    @OneToMany
    private Set<ImageUrl> imageUrls = new HashSet<>();

}
