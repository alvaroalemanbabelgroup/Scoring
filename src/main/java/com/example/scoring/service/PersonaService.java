package com.example.scoring.service;

import com.example.scoring.models.Persona;


public interface PersonaService {
    void insertarPersona(Persona persona);
    Persona getPersona(int personaId);
}
