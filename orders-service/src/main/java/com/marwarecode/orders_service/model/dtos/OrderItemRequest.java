package com.marwarecode.orders_service.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemRequest {
    private long id;
    private String sku;
    private Double pricel;
    private Long quantity;
}
