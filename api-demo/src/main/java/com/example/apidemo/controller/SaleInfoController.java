package com.example.apidemo.controller;

import com.example.apidemo.model.SaleInfo;
import com.example.apidemo.service.SaleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/sale-info-controller")
public class SaleInfoController {

    private SaleInfoService saleInfoService;

    @Autowired
    public SaleInfoController(SaleInfoService saleInfoService) {
        this.saleInfoService = saleInfoService;
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public ResponseEntity<List<SaleInfo>> findAll() {
        return new ResponseEntity<>(saleInfoService.findAll(), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/{id}")
    public ResponseEntity<SaleInfo> findOne(@PathVariable Long id) {
        return new ResponseEntity<>(saleInfoService.findOne(id), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<SaleInfo> delete(@PathVariable Long id) {
        return new ResponseEntity<>(saleInfoService.delete(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/")
    public ResponseEntity<SaleInfo> create(@RequestBody SaleInfo saleInfo) {
        return new ResponseEntity<>(saleInfoService.create(saleInfo), HttpStatus.CREATED);
    }
}
