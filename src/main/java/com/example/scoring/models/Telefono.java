package com.example.scoring.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
@Setter
public class Telefono {

    private int telefonoId;

    private int personaId;

    private String telefono;
}
