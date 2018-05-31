package com.valuetrue.table.repository;

import com.valuetrue.table.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findById(int id);
    List<Product> findByTableId(int table_id);
}
