package service;

import models.Persona;

import java.util.List;

public interface PersonaService {
    void addPersona(Persona persona);
    List<Persona> listaPersonas();
}
