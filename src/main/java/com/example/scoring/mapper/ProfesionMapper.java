package com.example.scoring.mapper;

import com.example.scoring.models.Profesion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface ProfesionMapper {
    @Insert("INSERT INTO SCORING.PROFESION (DESCRIPCION) " +
            "VALUES (#{descripcion_id})")
    @Options(useGeneratedKeys = true, keyProperty = "profesion_id", keyColumn = "PROFESION_ID")
    void addProfesion(Profesion profesion);
}
