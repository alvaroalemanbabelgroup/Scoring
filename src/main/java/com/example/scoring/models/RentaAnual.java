package com.example.scoring.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@Getter
@Setter
public class RentaAnual {
    private int renta_id;
    private int persona_id;
    private Profesion profesion;
    private int anio;
    private int importe;
    private int is_cuenta_propia;
    private String iae;
    private String cif_empleador;
    private Date fecha_inicio_empleo;
}
