package com.valuetrue.table.model;


import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "table_id")
    private Integer tableId;

    @Column(name = "quantity")
    private Integer quantity;

    // Implement Constructor
    public Product() { this.id = 0;    }

    public Product(String name, Integer tableId, Integer quantity) {
        this.name = name;
        this.tableId = tableId;
        this.quantity = quantity;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tableId=" + tableId +
                ", quantity=" + quantity +
                '}';
    }
}
