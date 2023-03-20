package com.example.scoring.service.impl;

import com.example.scoring.service.PersonaService;
import com.example.scoring.mapper.PersonaMapper;
import com.example.scoring.models.Persona;
import com.example.scoring.models.Telefono;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {
    private final PersonaMapper personaMapper;

    public PersonaServiceImpl(PersonaMapper personaMapper) {
        this.personaMapper = personaMapper;
    }

    @Transactional
    public void insertarPersona(Persona persona){
        personaMapper.addDireccion(persona.getDireccion_domicilio_id());
        personaMapper.addDireccion(persona.getDireccion_notificacion_id());
        personaMapper.addPersona(persona);
        for (Telefono t : persona.getTelefonoList()) {
            personaMapper.addTelefono(t);
        }
    }

    @Override
    public Persona getPersona(int personaId) {
        return personaMapper.getPersona(personaId);
    }

}
