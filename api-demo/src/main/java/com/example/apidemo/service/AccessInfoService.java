package com.example.apidemo.service;

import com.example.apidemo.dao.AccessInfoRepository;
import com.example.apidemo.model.AccessInfo;
import com.example.apidemo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccessInfoService {

    private AccessInfoRepository repository;

    @Autowired
    public AccessInfoService(AccessInfoRepository repository) {
        this.repository = repository;
    }

    public AccessInfo addAccessInfo(AccessInfo accessInfo) {
        return repository.save(accessInfo);
    }

    public List<AccessInfo> findAll() {
        Iterable<AccessInfo> accessInfoIterable = repository.findAll();
        List<AccessInfo> result = new ArrayList<>();
        accessInfoIterable.forEach(result::add);
        return result;
    }

    public AccessInfo findOne(Long id) {
        return repository.findById(id).get();
    }

    public AccessInfo delete(Long id) {
        AccessInfo accessInfoToBeDeleted = findOne(id);
        repository.delete(accessInfoToBeDeleted);
        return accessInfoToBeDeleted;
    }

    public AccessInfo create(AccessInfo accessInfo) {
        return repository.save(accessInfo);
    }

//    public AccessInfo update(Long id, AccessInfo newAccessInfoData) {
//        AccessInfo accessInfoToBeUpdated = findOne(id);
//        accessInfoToBeUpdated.setAccessInfo(newAccessInfoData.getAccessInfo());
//        repository.save(accessInfoToBeUpdated);
//        return accessInfoToBeUpdated;
//    }

//    public AccessInfo saveAccessInfo(AccessInfo info) {
//        repository.save(info);
//        return info;
//    }
//
//    public AccessInfo findOne(Long id) {
//        return repository.findById(id).get();
//    }
//
//    public AccessInfo delete(Long id) {
//        AccessInfo infoToBeDeleted =  findOne(id);
//        repository.delete(infoToBeDeleted);
//        return infoToBeDeleted;
//    }

}
