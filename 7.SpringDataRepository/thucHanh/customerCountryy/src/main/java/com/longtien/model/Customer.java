package com.longtien.model;

import javax.persistence.*;

@Entity

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String province;

    @ManyToOne
    @JoinColumn(name = "country_id" , referencedColumnName = "id")
    private Country country;

    public Customer(){}

    public Customer(Long id, String name, int age, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.province = country;
    }
    public Customer(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.province = country;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String country) {
        this.province = country;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", country='" + province + '\'' +
                '}';
    }
}
