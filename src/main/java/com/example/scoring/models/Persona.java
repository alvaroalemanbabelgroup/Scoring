package com.example.scoring.models;

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
    private Date fecha_nacimiento;
    private String nacionalidad;
    @Min(0)
    @Max(8)
    private int scoring;
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
