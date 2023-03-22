package com.example.scoring.mapper;

import com.example.scoring.models.RentaAnual;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface RentaAnualMapper {
    @Insert("INSERT INTO SCORING.RENTA_ANUAL (PERSONA_ID,PROFESION_ID, ANIO,IS_CUENTA_PROPIA, IAE, CIF_EMPLEADOR,FECHA_INICIO_EMPLEO,IMPORTE) " +
            "VALUES (#{persona.persona_id},#{profesion.profesion_id},#{anio},#{is_cuenta_propia}," +
            "#{iae},#{cif_empleador, jdbcType=NUMERIC},#{fecha_inicio_empleo, jdbcType=DATE},#{importe})")
    @Options(useGeneratedKeys = true, keyProperty = "renta_id", keyColumn = "RENTA_ID")
    void addRentaAnual(RentaAnual rentaAnual);
}
