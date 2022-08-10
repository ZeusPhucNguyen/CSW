package com.example.nguyenngocbaophuc.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="products")
public class Product{
    @Id
    private String id;
    private String name;
    private BigDecimal price;
    private int Quantity;
}
