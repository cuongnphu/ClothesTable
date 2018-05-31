package com.valuetrue.table.repository;


import com.valuetrue.table.model.Sewing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SewingRepository extends JpaRepository<Sewing,Integer> {
    Sewing findById(int id);
    List<Sewing> findByTableId(int table_id);
    List<Sewing> findByName(String name);

}
