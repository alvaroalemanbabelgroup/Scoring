package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
@Setter
public class Telefono {
    @NotNull
    private int telefonoId;
    @NotNull
    private int personaId;
    @NotNull
    private String telefono;
}
