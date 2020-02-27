package com.example.apidemo.dao;

import com.example.apidemo.model.VolumeInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolumeInfoRepository extends CrudRepository<VolumeInfo, Long> {
}
