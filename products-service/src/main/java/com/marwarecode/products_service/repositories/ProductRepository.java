package com.marwarecode.products_service.repositories;

import com.marwarecode.products_service.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public class ProductRepository extends JpaRepository<Product, Long> {
}
