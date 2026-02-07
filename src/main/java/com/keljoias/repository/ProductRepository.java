package com.keljoias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.keljoias.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
