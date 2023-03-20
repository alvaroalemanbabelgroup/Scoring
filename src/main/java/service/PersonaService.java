package service;

import models.Persona;


public interface PersonaService {
    void insertarPersona(Persona persona);
    Persona getPersona(int personaId);
}
