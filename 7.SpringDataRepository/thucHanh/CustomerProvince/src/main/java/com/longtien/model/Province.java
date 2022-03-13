package com.longtien.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "provinces")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long provinceId;
    private String provinceName;

    @OneToMany(mappedBy = "province")
    private Set<Customer> customers;


    public Province(Long provinceId, String nameProvince){
        this.provinceId = provinceId;
        this.provinceName = nameProvince;
    }

    public Province(String nameProvince){
        this.provinceName = nameProvince;
    }

    public Province() {
    }


    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long id) {
        this.provinceId = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String nameProvince) {
        this.provinceName = nameProvince;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
