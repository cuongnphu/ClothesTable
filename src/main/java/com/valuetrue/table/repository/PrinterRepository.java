package com.valuetrue.table.repository;


import com.valuetrue.table.model.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PrinterRepository extends JpaRepository<Printer,Integer> {
    Printer findById(int id);
    List<Printer> findByTableId(int table_id);
    List<Printer> findByName(String name);
    List<Printer> findByNameOrderByTableId(String name);

}
