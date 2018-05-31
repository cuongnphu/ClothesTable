package com.valuetrue.table.repository;


import com.valuetrue.table.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MaterialRepository extends JpaRepository<Material,Integer> {

    Material findById(int id);
    List<Material> findByTableId(int table_id);
}
