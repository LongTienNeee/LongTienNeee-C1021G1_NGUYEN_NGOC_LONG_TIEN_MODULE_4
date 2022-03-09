package com.longtien.model;


import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String blogName;
    private String dateCreate;
    private String content;

    public Blog(){}

    public Blog(Long id, String blogName, String dateCreate, String content) {
        this.id = id;
        this.blogName = blogName;
        this.dateCreate = dateCreate;
        this.content = content;
    }
    public Blog(String blogName, String dateCreate, String content) {
        this.blogName = blogName;
        this.dateCreate = dateCreate;
        this.content = content;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", blogName='" + blogName + '\'' +
                ", dateCreate=" + dateCreate +
                ", content='" + content + '\'' +
                '}';
    }
}
