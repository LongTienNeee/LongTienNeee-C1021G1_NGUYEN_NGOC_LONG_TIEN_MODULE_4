package com.longtien.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @Column (columnDefinition = "date")
    private String dateCreate;

    @Column (columnDefinition = "longtext")
    private String content;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "category_name")
    private Category category;

    public Blog(){
    }
    public Blog(Long id , String name, String dateCreate,Category category,String content){
        this.id=id;
        this.name=name;
        this.dateCreate=dateCreate;
        this.category=category;
        this.content=content;

    }
    public Blog( String name, String dateCreate,Category category,String content){
        this.name=name;
        this.dateCreate=dateCreate;
        this.category=category;
        this.content=content;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
