package controller;

import models.Persona;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @GetMapping("")
    public ResponseEntity<Object> addPersona(@ModelAttribute("persona") Persona persona){

        return null;
    }

}
