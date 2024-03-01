package citas2902082.entites;




import java.time.LocalDateTime;

import citas2902082.entites.enums.TipoSangre;
import citas2902082.entites.enums.TipodeIdentificacion;

public class Paciente {

    public Integer id;

    public String nombres;

    public String apellidos;

    public TipodeIdentificacion tipodeIdentificacion; 

    public Integer numeroIdentificacion;

    public String correoElectronico;

    public Integer celular;

    public LocalDateTime fechaNacimiento;

    public Double altura;

    public Double peso;

    public TipoSangre tipoSangre;

    public char factorRH;

    public Paciente(String nombres, String apellidos, TipodeIdentificacion tipodeIdentificacion,
            Integer numeroIdentificacion, String correoElectronico, Integer celular, LocalDateTime fechaNacimiento,
            Double altura, Double peso, TipoSangre tipoSangre, char factorRH) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipodeIdentificacion = tipodeIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    } 

}
