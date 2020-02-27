package com.example.apidemo.controller;

import com.example.apidemo.model.ImageLinks;
import com.example.apidemo.model.IndustryIdentifier;
import com.example.apidemo.service.IndustryIdentifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/industry-identifier-controller")
public class IndustryIdentifierController {

    private IndustryIdentifierService industryIdentifierService;

    @Autowired
    public IndustryIdentifierController(IndustryIdentifierService industryIdentifierService) {
        this.industryIdentifierService = industryIdentifierService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<IndustryIdentifier>> findAll() {
        return new ResponseEntity<>(industryIdentifierService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<IndustryIdentifier> findOne(@PathVariable Long id) {
        return new ResponseEntity<>(industryIdentifierService.findOne(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<IndustryIdentifier> delete(@PathVariable Long id) {
        return new ResponseEntity<>(industryIdentifierService.delete(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<IndustryIdentifier> create(@RequestBody IndustryIdentifier industryIdentifier) {
        return new ResponseEntity<>(industryIdentifierService.create(industryIdentifier), HttpStatus.CREATED);
    }
}
