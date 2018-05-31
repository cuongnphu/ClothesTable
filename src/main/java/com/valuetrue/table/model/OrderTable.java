package com.valuetrue.table.model;


import javax.persistence.*;


@Entity
@Table(name = "ordertable")
public class OrderTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "pre_weight")
    private Integer preWeight;

    @Column(name = "after_weight")
    private Integer afterWeight;

    // Implement constructor
    public OrderTable() {
        this.id = 0;
    }

    public OrderTable(String name, Integer preWeight, Integer afterWeight) {
        this.name = name;
        this.preWeight = preWeight;
        this.afterWeight = afterWeight;
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

    public Integer getPreWeight() {
        return preWeight;
    }

    public void setPreWeight(Integer preWeight) {
        this.preWeight = preWeight;
    }

    public Integer getAfterWeight() {
        return afterWeight;
    }

    public void setAfterWeight(Integer afterWeight) {
        this.afterWeight = afterWeight;
    }

    @Override
    public String toString() {
        return "OrderTable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preWeight=" + preWeight +
                ", afterWeight=" + afterWeight +
                '}';
    }
}
