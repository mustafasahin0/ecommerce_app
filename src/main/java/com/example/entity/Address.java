package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Address extends BaseEntity {

    private String name;
    private String street;
    private String zipCode;

    @ManyToOne
    private Customer customer;
}
