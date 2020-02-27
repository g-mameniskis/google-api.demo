package com.example.apidemo.dao;

import com.example.apidemo.model.AccessInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessInfoRepository extends CrudRepository<AccessInfo, Long> {
}
