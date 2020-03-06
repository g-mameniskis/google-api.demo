package com.example.apidemo.controller;

import com.example.apidemo.model.SaleInfo;
import com.example.apidemo.model.VolumeInfo;
import com.example.apidemo.service.VolumeInfoService;
import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/volume-info-controller")
public class VolumeInfoController {

    private VolumeInfoService volumeInfoService;

    @Autowired
    public VolumeInfoController(VolumeInfoService volumeInfoService) {
        this.volumeInfoService = volumeInfoService;
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public ResponseEntity<List<VolumeInfo>> findAll() {
        return new ResponseEntity<>(volumeInfoService.findAll(), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/{id}")
    public ResponseEntity<VolumeInfo> findOne(@PathVariable Long id) {
        return new ResponseEntity<>(volumeInfoService.findOne(id), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<VolumeInfo> delete(@PathVariable Long id) {
        return new ResponseEntity<>(volumeInfoService.delete(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/")
    public ResponseEntity<VolumeInfo> create(@RequestBody VolumeInfo volumeInfo) {
        return new ResponseEntity<>(volumeInfoService.create(volumeInfo), HttpStatus.CREATED);
    }
}
