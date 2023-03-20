package service.impl;

import mapper.PersonaMapper;
import models.Direccion;
import models.Persona;
import models.Telefono;
import org.springframework.stereotype.Service;
import service.PersonaService;

import java.util.List;
@Service
public class PersonaServiceImpl implements PersonaService {
    private final PersonaMapper personaMapper;

    public PersonaServiceImpl(PersonaMapper personaMapper) {
        this.personaMapper = personaMapper;
    }

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
