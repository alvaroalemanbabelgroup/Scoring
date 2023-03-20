package controller;

import models.Persona;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    private PersonaService personaService;
    @PostMapping("")
    public ResponseEntity<Object> addPersona(@ModelAttribute("persona") Persona persona){
        return personaService.addPersona(persona);
    }

}
