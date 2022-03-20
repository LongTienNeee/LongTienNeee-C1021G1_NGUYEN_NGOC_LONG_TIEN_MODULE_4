package com.longtien.service.province;

import com.longtien.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IProvinceService {
    Page<Province> findAll(Pageable pageable);
    Optional<Province> findById(Long id);
    void save(Province province);
    void delete(Province province);
}
