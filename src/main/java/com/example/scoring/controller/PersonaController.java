package com.example.scoring.controller;

import com.example.scoring.models.Persona;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.scoring.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    private PersonaService personaService;
    @GetMapping("{id}")
    public ResponseEntity<String> encuentraPersona(@PathVariable int id){
        personaService.getPersona(id);
        return ResponseEntity.ok("OK persona");
    }
    @PostMapping("")
    public ResponseEntity<String> addPersona(@RequestBody Persona persona){
        personaService.insertarPersona(persona);
        return ResponseEntity.ok("ok");
    }

}
