package models;

import java.util.Date;
import java.util.List;

public class Persona {
    private int persona_id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Direccion direccion_domicilio_id;
    private Direccion direccion_notificacion_id;
    private String nif;
    private Date fecha_nacimiento;
    private String nacionalidad;
    private int scoring;
    private Date fecha_scoring;
    private List<Telefono> telefonoList;


}
