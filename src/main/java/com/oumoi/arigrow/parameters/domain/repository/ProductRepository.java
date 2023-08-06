package com.oumoi.arigrow.parameters.domain.repository;


import com.oumoi.arigrow.parameters.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
