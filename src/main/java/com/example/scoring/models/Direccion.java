package com.example.scoring.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
@Setter
public class Direccion {
    @NotNull
    private int direccion_id;
    @NotNull
    private int tipoViaId;
    @NotNull
    private String nombreCalle;
    @NotNull
    private String num;
    private String piso;
    private String puerta;
    private String escalera;
    private String otro_dato;
    @NotNull
    private String cod_postal;
    @NotNull
    private String municipio;
    @NotNull
    private String cod_provincia;


}
