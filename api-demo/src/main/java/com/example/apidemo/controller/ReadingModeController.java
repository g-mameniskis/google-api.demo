package com.example.apidemo.controller;

import com.example.apidemo.model.IndustryIdentifier;
import com.example.apidemo.model.ReadingMode;
import com.example.apidemo.service.ReadingModeService;
import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/reading-mode-controller")
public class ReadingModeController {

    private ReadingModeService readingModeService;

    @Autowired
    public ReadingModeController(ReadingModeService readingModeService) {
        this.readingModeService = readingModeService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<ReadingMode>> findAll() {
        return new ResponseEntity<>(readingModeService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ReadingMode> findOne(@PathVariable Long id) {
        return new ResponseEntity<>(readingModeService.findOne(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ReadingMode> delete(@PathVariable Long id) {
        return new ResponseEntity<>(readingModeService.delete(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<ReadingMode> create(@RequestBody ReadingMode readingMode) {
        return new ResponseEntity<>(readingModeService.create(readingMode), HttpStatus.CREATED);
    }
}

