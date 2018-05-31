package com.valuetrue.table.repository;


import com.valuetrue.table.model.Embroidery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EmbroideryRepository extends JpaRepository<Embroidery,Integer> {

    List<Embroidery> findByTableId(int table_id);
    List<Embroidery> findByName(String name);
    Embroidery findById(int id);


}

