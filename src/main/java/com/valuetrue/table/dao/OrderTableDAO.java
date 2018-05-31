package com.valuetrue.table.dao;

import com.valuetrue.table.model.OrderTable;

import java.util.List;



public interface OrderTableDAO {
    public void saveOrderTable(OrderTable orderTable);
    public void updateOrderTable(OrderTable orderTable);
    public void deleteOrderTable(int id);
    public OrderTable getOrderTableById(int id);
    public List<OrderTable> getAllOrderTables();

}
