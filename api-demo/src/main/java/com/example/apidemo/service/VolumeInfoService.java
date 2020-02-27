package com.example.apidemo.service;

import com.example.apidemo.dao.VolumeInfoRepository;
import com.example.apidemo.model.SaleInfo;
import com.example.apidemo.model.VolumeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VolumeInfoService {

    private VolumeInfoRepository repository;

    @Autowired
    public VolumeInfoService(VolumeInfoRepository repository) {
        this.repository = repository;
    }

    public VolumeInfo addVolumeInfo(VolumeInfo volumeInfo) {
        return repository.save(volumeInfo);
    }

    public List<VolumeInfo> findAll() {
        Iterable<VolumeInfo> volumeInfoIterable = repository.findAll();
        List<VolumeInfo> result = new ArrayList<>();
        volumeInfoIterable.forEach(result::add);
        return result;
    }

    public VolumeInfo findOne(Long id) {
        return repository.findById(id).get();
    }

    public VolumeInfo delete(Long id) {
        VolumeInfo volumeInfoToBeDeleted = findOne(id);
        repository.delete(volumeInfoToBeDeleted);
        return volumeInfoToBeDeleted;
    }

    public VolumeInfo create(VolumeInfo volumeInfo) {
        return repository.save(volumeInfo);
    }

}
