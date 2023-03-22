package com.example.scoring.mapper;

import com.example.scoring.models.Profesion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProfesionMapper {
    @Insert("INSERT INTO SCORING.PROFESION (DESCRIPCION) " +
            "VALUES (#{descripcion_id})")
    @Options(useGeneratedKeys = true, keyProperty = "profesion_id", keyColumn = "PROFESION_ID")
    void addProfesion(Profesion profesion);

    @Select("SELECT COUNT(PROFESION_ID) FROM PROFESION WHERE PROFESION_ID = #{profesionId}")
    int existeProfesion(int profesionId);
}
