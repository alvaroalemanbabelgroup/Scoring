package com.example.scoring.mapper;

import com.example.scoring.models.Direccion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface DireccionMapper {
    @Insert("INSERT INTO SCORING.DIRECCION (TIPO_VIA_ID,NOMBRE_CALLE, NUM,PISO,PUERTA, ESCALERA, OTRO_DATO,COD_POSTAL, MUNICIPIO, COD_PROVINCIA) " +
            "VALUES (#{tipoViaId},#{nombreCalle},#{num},#{piso, jdbcType=VARCHAR},#{puerta, jdbcType=VARCHAR}," +
            "#{escalera, jdbcType=VARCHAR},#{otro_dato, jdbcType=VARCHAR},#{cod_postal},#{municipio},#{cod_provincia})")
    @Options(useGeneratedKeys = true, keyProperty = "direccion_id", keyColumn = "DIRECCION_ID")
    void addDireccion(Direccion direccion);
}
