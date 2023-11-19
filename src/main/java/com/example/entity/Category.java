package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Category extends BaseEntity{

    private String name;

}
