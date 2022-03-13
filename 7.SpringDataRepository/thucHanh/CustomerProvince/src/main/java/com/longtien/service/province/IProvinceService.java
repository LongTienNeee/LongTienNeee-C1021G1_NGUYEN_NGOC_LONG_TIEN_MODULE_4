package com.longtien.service.province;

import com.longtien.model.Province;

public interface IProvinceService {
    Iterable<Province> findAll();

    void create(Province province);
}
