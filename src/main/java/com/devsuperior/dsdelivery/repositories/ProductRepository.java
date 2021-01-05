package com.devsuperior.dsdelivery.repositories;

import java.util.List;

import com.devsuperior.dsdelivery.domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
    
    List<Product> findAllByOrderByNameAsc();

}