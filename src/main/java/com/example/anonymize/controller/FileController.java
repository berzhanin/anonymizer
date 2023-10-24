package com.example.anonymize.controller;

import com.example.anonymize.service.FileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/directory")
public class FileController {

    private final FileService service;

    public FileController(FileService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<String>> getAllFilesInDirectory(@RequestBody String name) {
        return new ResponseEntity<>(service.findAll(new File(name)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<String>> anonymizeFilesInDirectory(@RequestBody String name) throws IOException {
        service.anonymizeDirectory(new File(name));
        System.out.println("Directory after anonymize-process: ");
        return new ResponseEntity<>(service.findAll(new File(name)), HttpStatus.OK);
    }
}