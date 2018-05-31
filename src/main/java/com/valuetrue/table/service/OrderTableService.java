package com.valuetrue.table.service;

import com.valuetrue.table.model.OrderTable;

import java.util.List;



public interface OrderTableService {

    public void saveOrderTable(OrderTable orderTable);
    public void updateOrderTable(OrderTable orderTable);
    public void deleteOrderTable(int id);
    public OrderTable getOrderTableById(int id);
    public List<OrderTable> getAllOrderTables();
}
