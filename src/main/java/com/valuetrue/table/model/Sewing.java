package com.valuetrue.table.model;


import javax.persistence.*;

@Entity
@Table(name = "sewing")
public class Sewing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "table_id")
    private Integer tableId;

    @Column(name = "price")
    private Integer price;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "total")
    private Integer total;

    // Implement Constructor
    public Sewing() { this.id = 0;    }

    public Sewing(String name, Integer tableId, Integer price, Integer quantity, Integer total) {
        this.name = name;
        this.tableId = tableId;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
    }

    // Generate Getter & Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Sewing{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tableId=" + tableId +
                ", price=" + price +
                ", quantity=" + quantity +
                ", total=" + total +
                '}';
    }
}
