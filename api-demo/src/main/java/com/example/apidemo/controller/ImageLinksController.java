package com.example.apidemo.controller;

import com.example.apidemo.model.ImageLinks;
import com.example.apidemo.service.ImageLinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/image-links-controller")
public class ImageLinksController {

    private ImageLinksService imageLinksService;

    @Autowired
    public ImageLinksController(ImageLinksService imageLinksService) {
        this.imageLinksService = imageLinksService;
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public ResponseEntity<List<ImageLinks>> findAll() {
        return new ResponseEntity<>(imageLinksService.findAll(), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/{id}")
    public ResponseEntity<ImageLinks> findOne(@PathVariable Long id) {
        return new ResponseEntity<>(imageLinksService.findOne(id), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ImageLinks> delete(@PathVariable Long id) {
        return new ResponseEntity<>(imageLinksService.delete(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/")
    public ResponseEntity<ImageLinks> create(@RequestBody ImageLinks imageLinks) {
        return new ResponseEntity<>(imageLinksService.create(imageLinks), HttpStatus.CREATED);
    }


//    @PutMapping("/{id}")
//    public ResponseEntity<ImageLinks> update(@PathVariable Long id, @RequestBody Book newBookData) {
//        return new ResponseEntity<>(imageLinksService.update(id, newBookData), HttpStatus.OK);
//    }
}
