package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@Data
public class Order extends BaseEntity{

    private BigDecimal paidPrice;
    private BigDecimal totalPrice;

    @OneToOne
    private Payment payment;

    @OneToOne
    private Cart cart;

    @ManyToOne
    private Customer customer;

}
