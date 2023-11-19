package com.example.entity;

import com.example.enums.DiscountType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table
@Data
@NoArgsConstructor
public class Discount extends BaseEntity{

    private BigDecimal discount;
    @Enumerated(EnumType.STRING)
    private DiscountType discountType;
    private String name;
}
