package citas2902082.entites;

import citas2902082.entites.enums.TipodeIdentificacion;

public abstract class Usuario {

    protected Integer id;
    protected String nombres;
    protected String apellidos;
    protected TipodeIdentificacion tipoIdent;
    protected Long numeroIdentificacion;
    public Usuario(Integer id, String nombres, String apellidos, TipodeIdentificacion tipoIdent,
            Long numeroIdentificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdent = tipoIdent;
        this.numeroIdentificacion = numeroIdentificacion;
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
    public TipodeIdentificacion getTipoIdent() {
        return tipoIdent;
    }
    public void setTipoIdent(TipodeIdentificacion tipoIdent) {
        this.tipoIdent = tipoIdent;
    }
    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    //defirir el metodo toString

    @Override
    public String toString() {
        return "Usuario [nombres=" + nombres + ", apellidos=" + apellidos + "]";
    }

    
}
