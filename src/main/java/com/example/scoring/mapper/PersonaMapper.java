package com.example.scoring.mapper;

import com.example.scoring.models.Persona;
import com.example.scoring.models.Telefono;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PersonaMapper {
    @Select("Select PERSONA_ID, NOMBRE,APELLIDO1, APELLIDO2,DIRECCION_DOMICILIO_ID,DIRECCION_NOTIFICACION_ID," +
            "NIF, FECHA_NACIMIENTO,NACIONALIDAD, SCORING, FECHA_SCORING FROM SCORING.PERSONA WHERE PERSONA_ID = #{personaId")
    Persona getPersona(int personaId);

    @Insert("INSERT INTO SCORING.PERSONA (NOMBRE,APELLIDO1, APELLIDO2,DIRECCION_DOMICILIO_ID,DIRECCION_NOTIFICACION_ID, NIF, FECHA_NACIMIENTO,NACIONALIDAD, SCORING, FECHA_SCORING) " +
            "VALUES (#{nombre},#{apellido1},#{apellido2, jdbcType=VARCHAR},#{direccion_domicilio.direccion_id},#{direccion_notificacion.direccion_id}," +
            "#{nif},#{fecha_nacimiento, jdbcType=DATE},#{nacionalidad},#{scoring, jdbcType=NUMERIC},#{fecha_scoring, jdbcType=DATE})")
    @Options(useGeneratedKeys = true, keyProperty = "persona_id", keyColumn = "PERSONA_ID")
    void addPersona(Persona persona);

    @Insert("INSERT INTO SCORING.TELEFONO_CONTACTO (TELEFONO_ID, PERSONA_ID,TELEFONO) " +
            "VALUES (#{telefono_id},#{persona_id},#{telefono})")
    void addTelefono(Telefono telefono);

}
