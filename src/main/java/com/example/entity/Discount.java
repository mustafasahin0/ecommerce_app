package com.example.entity;

import com.example.enums.DiscountType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Discount extends BaseEntity{

    private BigDecimal discount;
    private String name;
    @Enumerated(EnumType.STRING)
    private DiscountType discountType;

}
