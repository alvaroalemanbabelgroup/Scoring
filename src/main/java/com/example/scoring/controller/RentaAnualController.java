package com.example.scoring.controller;

import com.example.scoring.models.RentaAnual;
import com.example.scoring.service.RentaAnualService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentaAnualController {
    private RentaAnualService rentaAnualService;

    public RentaAnualController(RentaAnualService rentaAnualService) {
        this.rentaAnualService = rentaAnualService;
    }

    @PostMapping("/renta")
    ResponseEntity addRentaAnual(@RequestBody RentaAnual rentaAnual){
        this.rentaAnualService.insertaRentaAnual(rentaAnual);
        return ResponseEntity.ok(rentaAnual);
    }
}
