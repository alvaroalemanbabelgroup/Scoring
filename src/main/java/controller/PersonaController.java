package controller;

import models.Persona;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.PersonaService;

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
