package com.valuetrue.table.model;


import javax.persistence.*;

@Entity
@Table(name = "material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "table_id")
    private Integer tableId;

    @Column(name = "weight")
    private Float weight;

    @Column(name = "num_class")
    private Integer numClass;

    @Column(name = "quantity")
    private Integer quantity;

    // Implement constructor
    public Material() {this.id = 0; }

    public Material(String name, Integer tableId, Float weight, Integer numClass, Integer quantity) {
        this.name = name;
        this.tableId = tableId;
        this.weight = weight;
        this.numClass = numClass;
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

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getNumClass() {
        return numClass;
    }

    public void setNumClass(Integer numClass) {
        this.numClass = numClass;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tableId=" + tableId +
                ", weight=" + weight +
                ", numClass=" + numClass +
                ", quantity=" + quantity +
                '}';
    }
}
