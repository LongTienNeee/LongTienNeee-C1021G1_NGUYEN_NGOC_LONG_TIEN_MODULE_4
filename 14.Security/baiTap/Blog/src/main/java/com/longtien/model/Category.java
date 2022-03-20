
package com.longtien.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long category_id;
    private String category_name;

    @OneToMany(mappedBy = "category")
    private Set<Blog> blogs;

    public Category(){}

    public Category(Long id, String name){
        this.category_id =id;
        this.category_name =name;
    }

    public Category( String name){
        this.category_name =name;

    }
    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long id) {
        this.category_id = id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String name) {
        this.category_name = name;
    }


    @Override
    public String toString() {
        return "Category{" +
                "id=" + category_id +
                ", name='" + category_name + '\'' +
                '}';
    }
}
