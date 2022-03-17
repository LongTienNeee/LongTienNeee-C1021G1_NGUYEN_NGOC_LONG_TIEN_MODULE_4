package com.longtien.model;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private int age;

    @Column(columnDefinition = "LONGTEXT")
    private String img;

    public Customer(){}

    public Customer(Long id, String name, int age ,  String img) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.img = img;
    }

    public Customer( String name, int age, String img) {
        this.name = name;
        this.age = age;
        this.img = img;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }
}
