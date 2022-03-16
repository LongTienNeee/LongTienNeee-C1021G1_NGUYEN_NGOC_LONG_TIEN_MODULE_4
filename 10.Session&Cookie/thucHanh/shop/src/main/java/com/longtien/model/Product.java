package com.longtien.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameProduct;
    private double priceProduct;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    @Column(columnDefinition = "LONGTEXT")
    private String img;

    public Product(){}

    public Product(Long id, String nameProduct, double priceProduct, String description, String img) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.description = description;
        this.img = img;
    }

    public Product(String nameProduct, double priceProduct, String description, String img) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.description = description;
        this.img = img;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
