package citas2902082.entites;

import citas2902082.entites.enums.TipodeIdentificacion;
import citas2902082.entites.enums.Especialidades;

public class Medico {

    public Integer id;

    public String nombre;

    public String apellido;

    public TipodeIdentificacion tipodeIdentificacion;

    public String numerodeIdentificacion;

    public Integer registroMedico;

    public Especialidades especialidad;

    public Medico(String nombre, String apellido, TipodeIdentificacion tipodeIdentificacion,
            String numerodeIdentificacion, Integer registroMedico, Especialidades especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipodeIdentificacion = tipodeIdentificacion;
        this.numerodeIdentificacion = numerodeIdentificacion;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    } 

}
