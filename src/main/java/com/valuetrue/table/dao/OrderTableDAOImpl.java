package com.valuetrue.table.dao;

import com.valuetrue.table.model.OrderTable;
import com.valuetrue.table.repository.OrderTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class OrderTableDAOImpl implements OrderTableDAO {

    private OrderTableRepository orderTableRepository;

    @Autowired
    public void setOrderTableRepository(OrderTableRepository orderTableRepository) {
        this.orderTableRepository = orderTableRepository;
    }

    // SAVE a new OrderTable
    @Override
    public void saveOrderTable(OrderTable orderTable) {
        orderTableRepository.save(orderTable);
    }

    // UPDATE a particular orderTable
    @Override
    public void updateOrderTable(OrderTable orderTable) {
        OrderTable orderTab = orderTableRepository.getOne(orderTable.getId());
        orderTab.setName(orderTable.getName());
        orderTableRepository.save(orderTab);
    }

    // DELETE a orderTable by Id
    @Override
    public void deleteOrderTable(int id) {
        orderTableRepository.deleteById(id);
    }

    // GET a orderTable by Id
    @Override
    public OrderTable getOrderTableById(int id) {
        return orderTableRepository.findById(id);
    }

    // GET all orderTables
    @Override
    public List<OrderTable> getAllOrderTables() {
        return orderTableRepository.findAll();
    }
}
