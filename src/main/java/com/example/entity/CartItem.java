package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CartItem extends BaseEntity {

    private int quantity;

    @ManyToOne
    private Product product;
    @ManyToOne
    private Cart cart;

}
