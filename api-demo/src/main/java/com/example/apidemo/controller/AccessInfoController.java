package com.example.apidemo.controller;

import com.example.apidemo.model.AccessInfo;
import com.example.apidemo.model.BookQueryResult;
import com.example.apidemo.service.AccessInfoService;
import com.example.apidemo.utils.BookQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/access-info-controller")
public class AccessInfoController {
    private AccessInfoService service;

    @Autowired
    public AccessInfoController(AccessInfoService service) {
        this.service = service;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<AccessInfo>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/{id}")
    public ResponseEntity<AccessInfo> findOne(@PathVariable Long id) {
        return new ResponseEntity<>(service.findOne(id), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<AccessInfo> delete(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/")
    public ResponseEntity<AccessInfo> create(@RequestBody AccessInfo accessInfo) {
        return new ResponseEntity<>(service.create(accessInfo), HttpStatus.CREATED);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<AccessInfo> update(@PathVariable Long id, @RequestBody AccessInfo newAccessInfoData) {
//        return new ResponseEntity<>(service.update(id, newAccessInfoData), HttpStatus.OK);
//    }



//    @GetMapping(value = "/{id}")
//    public ResponseEntity<?> findOne(@PathVariable Long id) {
//        return new ResponseEntity<>(service.findOne(id), HttpStatus.OK);
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<?> delete(@PathVariable Long id) {
//        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
//    }
//
//    @PostMapping(value = "/")
//    public ResponseEntity<BookQueryResult> create(@RequestBody AccessInfo query) {
//        AccessInfo result = service.saveAccessInfo(query);
//        return new ResponseEntity<>(result, HttpStatus.OK)
//    }
}
