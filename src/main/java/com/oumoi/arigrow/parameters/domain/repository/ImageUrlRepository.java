package com.oumoi.arigrow.parameters.domain.repository;


import com.oumoi.arigrow.parameters.domain.entity.ImageUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageUrlRepository extends JpaRepository<ImageUrl,Long> {
}
