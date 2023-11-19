package com.example.entity;


import com.example.enums.CartState;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Cart extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CartState cartState;


    @ManyToOne
    private Discount discount;

    @ManyToOne
    private Customer customer;
}
