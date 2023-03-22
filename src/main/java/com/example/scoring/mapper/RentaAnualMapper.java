package com.example.scoring.mapper;

import com.example.scoring.models.Direccion;
import com.example.scoring.models.RentaAnual;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface RentaAnualMapper {
    @Insert("INSERT INTO SCORING.RENTA_ANUAL (PERSONA_ID,PROFESION_ID, ANIO,IMPORTE,IS_CUENTA_PROPIA, IAE, CIF_EMPLEADO,FECHA_INICIO_EMPLEADO) " +
            "VALUES (#{persona_id},#{profesion_id},#{anio},#{importe},#{is_cuenta_propia}," +
            "#{iae},#{cif_empleado},#{fecha_inicio_empleado, jdbcType=DATE})")
    @Options(useGeneratedKeys = true, keyProperty = "renta_id", keyColumn = "RENTA_ID")
    void addRentaAnual(RentaAnual rentaAnual);
}
