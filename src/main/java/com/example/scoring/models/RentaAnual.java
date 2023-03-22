package com.example.scoring.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@Getter
@Setter
public class RentaAnual {
    private int renta_id;
   // private int persona_id;

    private Persona persona;
    private Profesion profesion;
    private int anio;
    private int importe;
    private int is_cuenta_propia;
    private String iae;
    private String cif_empleador;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date fecha_inicio_empleo;
}
