package com.longtien.model;

import javax.persistence.*;

@Entity
public class SmartPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String producer;
    private String model;
    private double price;

    public SmartPhone(){}

    public SmartPhone(Long id, String producer, String model, double price){
        this.id = id;
        this.producer = producer;
        this.model = model;
        this.price= price;
    }
    public SmartPhone( String producer, String model, double price){

        this.producer = producer;
        this.model = model;
        this.price= price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
