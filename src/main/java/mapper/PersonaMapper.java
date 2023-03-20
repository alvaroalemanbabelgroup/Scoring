package mapper;

import models.Persona;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PersonaMapper {
    @Select("Select PERSONA_ID, NOMBRE,APELLIDO1, APELLIDO2,DIRECCION_DOMICILIO_ID,DIRECCION_NOTIFICACION_ID," +
            "NIF, FECHA_NACIMIENTO,NACIONALIDAD, SCORING, FECHA_SCORING FROM SCORING.PERSONA WHERE PERSONA_ID = #{personaId")
    Persona getPersona(int personaId);

    @Insert("INSERT INTO SCORING.PERSONA (PERSONA_ID, NOMBRE,APELLIDO1, APELLIDO2,DIRECCION_DOMICILIO_ID,DIRECCION_NOTIFICACION_ID, NIF, FECHA_NACIMIENTO,NACIONALIDAD, SCORING, FECHA_SCORING) " +
            "VALUES (#{persona_id},#{nombre},#{apellido1},#{apellido2},#{direccion_domicilio_id},#{direccion_notificacion_id}," +
            "#{nif},#{fecha_nacimiento},#{nacionalidad},#{scoring},#{fecha_scoring})")
    void addPersona(Persona persona);
}
