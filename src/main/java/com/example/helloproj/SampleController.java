package com.example.helloproj;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public ResponseEntity<String> sample() {
        return ResponseEntity.ok("hello world!");
    }
}
