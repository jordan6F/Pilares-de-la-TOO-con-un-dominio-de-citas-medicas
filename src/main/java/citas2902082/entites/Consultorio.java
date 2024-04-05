package citas2902082.entites;

public class Consultorio {

    public Integer id;

    public String direccion;

    public Integer numero;

    public Consultorio(Integer id, String direccion, long l) {

        this.id=id;
        this.direccion = direccion;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Consultorio [id=" + id + ", direccion=" + direccion + ", numero=" + numero + "]";
    }  

    
}
