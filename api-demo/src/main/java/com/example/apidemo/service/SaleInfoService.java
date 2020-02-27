package com.example.apidemo.service;

import com.example.apidemo.dao.SaleInfoRepository;
import com.example.apidemo.model.SaleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SaleInfoService {

    private SaleInfoRepository repository;

    @Autowired
    public SaleInfoService(SaleInfoRepository repository) {
        this.repository = repository;
    }

    public SaleInfo addSaleInfo(SaleInfo saleInfo) {
        return repository.save(saleInfo);
    }

    public List<SaleInfo> findAll() {
        Iterable<SaleInfo> saleInfoIterable = repository.findAll();
        List<SaleInfo> result = new ArrayList<>();
        saleInfoIterable.forEach(result::add);
        return result;
    }

    public SaleInfo findOne(Long id) {
        return repository.findById(id).get();
    }

    public SaleInfo delete(Long id) {
        SaleInfo saleInfoToBeDeleted = findOne(id);
        repository.delete(saleInfoToBeDeleted);
        return saleInfoToBeDeleted;
    }

    public SaleInfo create(SaleInfo saleInfo) {
        return repository.save(saleInfo);
    }

}
