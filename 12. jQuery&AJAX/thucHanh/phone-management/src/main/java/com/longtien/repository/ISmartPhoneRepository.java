package com.longtien.repository;

import com.longtien.model.SmartPhone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISmartPhoneRepository extends JpaRepository<SmartPhone, Long> {
}
