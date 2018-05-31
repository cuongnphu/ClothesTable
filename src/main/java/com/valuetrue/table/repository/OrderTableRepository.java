package com.valuetrue.table.repository;


import com.valuetrue.table.model.OrderTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface OrderTableRepository extends JpaRepository<OrderTable,Integer> {
    OrderTable findById(int id);

}
