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

    public String factorRH;

    public Paciente(String nombres, String apellidos, TipodeIdentificacion tipodeIdentificacion,
            long l, String correoElectronico, Integer celular, LocalDateTime fechaNacimiento,
            Double altura, Double peso, TipoSangre tipoSangre, String factorRH) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipodeIdentificacion getTipodeIdentificacion() {
        return tipodeIdentificacion;
    }

    public void setTipodeIdentificacion(TipodeIdentificacion tipodeIdentificacion) {
        this.tipodeIdentificacion = tipodeIdentificacion;
    }

    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Integer numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(String factorRH) {
        this.factorRH = factorRH;
    } 
    

}
