package com.marwarecode.orders_service.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderRequest {
    private List<OrderItemRequest> orderItems;
}
