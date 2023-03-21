package com.example.scoring.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
@Setter
public class Direccion {
    private int direccion_id;
    private int tipoViaId;
    private String nombreCalle;
    private String num;
    private String piso;
    private String puerta;
    private String escalera;
    private String otro_dato;
    private String cod_postal;
    private String municipio;
    private String cod_provincia;


}
