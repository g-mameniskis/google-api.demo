package com.example.apidemo.dao;

import com.example.apidemo.model.SaleInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleInfoRepository extends CrudRepository<SaleInfo, Long> {
}
