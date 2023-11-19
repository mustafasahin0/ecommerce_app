package com.example.entity;


import com.example.enums.CartState;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table
@NoArgsConstructor
@Data
public class Cart extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CartState cartState;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Discount discount;
}
