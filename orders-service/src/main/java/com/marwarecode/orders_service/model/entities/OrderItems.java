package com.marwarecode.orders_service.model.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String sku;
    private Double pricel;
    private Long quantity;
}
