package com.naru.api.data.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootCore.api.data.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
