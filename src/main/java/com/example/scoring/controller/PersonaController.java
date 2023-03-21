package com.example.scoring.controller;

import com.example.scoring.models.Persona;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.scoring.service.PersonaService;

@RestController
public class PersonaController {

    private PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("{id}")
    ResponseEntity encuentraPersona(@PathVariable int id){
        personaService.getPersona(id);
        return ResponseEntity.ok("OK persona");
    }
    @PostMapping("/persona")
    ResponseEntity addPersona(@RequestBody Persona persona){
        this.personaService.insertarPersona(persona);
        return ResponseEntity.ok(persona);
    }

}
