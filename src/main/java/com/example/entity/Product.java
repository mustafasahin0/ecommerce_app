package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jdk.jfr.Enabled;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Product extends BaseEntity {

    private String name;
    private BigDecimal price;
    private int quantity;
    private int remainingQuantity;

    @ManyToMany()
    @JoinTable(name = "product_category_rel", joinColumns = @JoinColumn(name = "p_id"), inverseJoinColumns = @JoinColumn(name = "c_id"))
    private List<Category> categoryList;
}
