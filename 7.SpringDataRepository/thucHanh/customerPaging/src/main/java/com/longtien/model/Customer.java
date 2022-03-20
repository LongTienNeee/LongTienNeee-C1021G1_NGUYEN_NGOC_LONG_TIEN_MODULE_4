package com.longtien.model;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    private Long id;
    private String name;
    private int age;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id" , referencedColumnName = "name")
    private Province province;

    public Customer(){}
    public Customer(Long id, String name, int age, Province province) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.province = province;
    }
    public Customer( String name, int age, Province province) {
        this.name = name;
        this.age = age;
        this.province = province;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
