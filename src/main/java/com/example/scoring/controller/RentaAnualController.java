package com.example.scoring.controller;

import com.example.scoring.models.RentaAnual;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentaAnualController {
    @PostMapping("/renta")
    ResponseEntity addRentaAnual(@RequestBody RentaAnual rentaAnual){
        return ResponseEntity.ok(" OK Renta anual");
    }
}
