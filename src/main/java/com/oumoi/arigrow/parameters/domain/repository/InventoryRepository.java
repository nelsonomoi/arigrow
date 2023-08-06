package com.oumoi.arigrow.parameters.domain.repository;

import com.oumoi.arigrow.parameters.domain.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long>{
}
