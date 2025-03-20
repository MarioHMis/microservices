package com.marwarecode.orders_service.services;


import com.marwarecode.orders_service.model.dtos.OrderItemRequest;
import com.marwarecode.orders_service.model.dtos.OrderRequest;

import com.marwarecode.orders_service.model.entities.Order;
import com.marwarecode.orders_service.model.entities.OrderItems;
import com.marwarecode.orders_service.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
      Order order = new Order();
      order.setOrderNumber(UUID.randomUUID().toString());
      order.setOrderItems(orderRequest.getOrderItems().stream()
              .map(orderItemRequest -> mapOrderItemRequestToOrderItem(orderItemRequest, order))
              .collect(Collectors.toList()));

        this.orderRepository.save(order);
    }

    private OrderItems mapOrderItemRequestToOrderItem(OrderItemRequest orderItemRequest, Order order) {
        return OrderItems.builder()
                .id(orderItemRequest.getId())
                .sku(orderItemRequest.getSku())
                .pricel(orderItemRequest.getPricel())
                .quantity(orderItemRequest.getQuantity())
                .order(order)
                .build();
    }
}
