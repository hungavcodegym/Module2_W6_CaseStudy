package com.codegym.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "material")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String name;
    private Date importDate;
    private String description;
    private Double price;
    private int quantity;
    private String image;

    @ManyToOne
    @JoinColumn(name = "supplierID")
    private Supplier supplier;

    public Material() {
    }

    public Material(String code, String name, Date importDate, String description, Double price, int quantity, String image, Supplier supplier) {
        this.code = code;
        this.name = name;
        this.importDate = importDate;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
        this.supplier = supplier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
