package com.example.scoring.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Persona {
    private int persona_id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Direccion direccion_domicilio;
    private boolean direccionDomicilioSameAsNotificacion = true;
    private Direccion direccion_notificacion;
    private String nif;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date fecha_nacimiento;
    private String nacionalidad;
    @Min(1)
    @Max(8)
    private int scoring;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date fecha_scoring;
    private List<Telefono> telefonoList;


    public boolean isDireccionDomicilioSameAsNotificacion() {
        if (this.direccion_domicilio == this.direccion_notificacion){
            return true;
        }else{
            return false;
        }
    }
}
