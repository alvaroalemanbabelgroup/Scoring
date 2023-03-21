package com.example.scoring.service.impl;

import com.example.scoring.mapper.DireccionMapper;
import com.example.scoring.service.PersonaService;
import com.example.scoring.mapper.PersonaMapper;
import com.example.scoring.models.Persona;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {
    private PersonaMapper personaMapper;
    private DireccionMapper direccionMapper;

    public PersonaServiceImpl(PersonaMapper personaMapper, DireccionMapper direccionMapper) {
        this.personaMapper = personaMapper;
        this.direccionMapper = direccionMapper;
    }

    @Override
    @Transactional
    public Persona insertarPersona(Persona persona){
        persona = this.addPersonaDireccion(persona);
        this.personaMapper.addPersona(persona);
//        for (Telefono t : persona.getTelefonoList()) {
//            personaMapper.addTelefono(t);
//        }
        return persona;
    }

    private Persona addPersonaDireccion(Persona persona){
        this.direccionMapper.addDireccion(persona.getDireccion_domicilio());

        if (persona.isDireccionDomicilioSameAsNotificacion()){
            persona.setDireccion_notificacion(persona.getDireccion_domicilio());
        }else{
            this.direccionMapper.addDireccion(persona.getDireccion_notificacion());
        }
        return persona;
    }

    @Override
    public Persona getPersona(int personaId) {
        return personaMapper.getPersona(personaId);
    }

}
